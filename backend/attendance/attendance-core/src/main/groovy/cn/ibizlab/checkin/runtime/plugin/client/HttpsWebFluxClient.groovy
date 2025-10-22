package cn.ibizlab.checkin.runtime.plugin.client

import io.netty.handler.ssl.SslContext
import io.netty.handler.ssl.SslContextBuilder
import io.netty.handler.ssl.util.InsecureTrustManagerFactory
import net.ibizsys.central.plugin.spring.service.client.WebFluxClient
import net.ibizsys.central.service.client.WebClientBase
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.http.client.reactive.ReactorClientHttpConnector
import org.springframework.http.codec.json.Jackson2JsonDecoder
import org.springframework.http.codec.json.Jackson2JsonEncoder
import org.springframework.util.StringUtils
import org.springframework.web.reactive.function.client.WebClient
import reactor.netty.http.client.HttpClient

/**
 * https时忽略 ssl 
 */
class HttpsWebFluxClient extends WebFluxClient {

    private final Log log = LogFactory.getLog(HttpsWebFluxClient.class)
    private WebClient webClient = null;
    private WebClient webClient2 = null;

    @Override
    protected WebClient getWebClient(String strUri) {

        if (StringUtils.hasLength(this.getServiceUrl())) {
            if (this.webClient == null) {
                if (this.getServiceUrl().indexOf("lb://") == 0) {
                    this.webClient = WebClient.builder().codecs({ configurer ->
                        configurer.defaultCodecs().jackson2JsonDecoder(new Jackson2JsonDecoder(WebClientBase.MAPPER));
                        configurer.defaultCodecs().jackson2JsonEncoder(new Jackson2JsonEncoder(WebClientBase.OUTMAPPER));
                        configurer.defaultCodecs().maxInMemorySize(getMaxInMemorySize());
                    }).filter(getExchangeFilterFunction()).baseUrl(this.getServiceUrl()).build();
                } else {

                    SslContext sslContext = SslContextBuilder
                            .forClient()
                            .trustManager(InsecureTrustManagerFactory.INSTANCE)
                            .build();

                    HttpClient httpClient = HttpClient.create().secure { t -> t.sslContext(sslContext) };

                    this.webClient = WebClient.builder().codecs({ configurer ->
                        configurer.defaultCodecs().jackson2JsonDecoder(new Jackson2JsonDecoder(WebClientBase.MAPPER));
                        configurer.defaultCodecs().jackson2JsonEncoder(new Jackson2JsonEncoder(WebClientBase.OUTMAPPER));
                        configurer.defaultCodecs().maxInMemorySize(getMaxInMemorySize());
                    }).baseUrl(this.getServiceUrl()).clientConnector(new ReactorClientHttpConnector(httpClient)).build();
                }
            }
            return this.webClient;
        } else if (StringUtils.hasLength(strUri) && strUri.indexOf("lb://") == 0) {
            if (this.webClient == null) {
                this.webClient = WebClient.builder().codecs({ configurer ->
                    configurer.defaultCodecs().jackson2JsonDecoder(new Jackson2JsonDecoder(WebClientBase.MAPPER));
                    configurer.defaultCodecs().jackson2JsonEncoder(new Jackson2JsonEncoder(WebClientBase.OUTMAPPER));
                    configurer.defaultCodecs().maxInMemorySize(getMaxInMemorySize());
                }).filter(getExchangeFilterFunction()).build();
            }
            return this.webClient;
        } else {
            if (this.webClient2 == null) {

                SslContext sslContext = SslContextBuilder
                        .forClient()
                        .trustManager(InsecureTrustManagerFactory.INSTANCE)
                        .build();

                HttpClient httpClient = HttpClient.create().secure { t -> t.sslContext(sslContext) };

                this.webClient2 = WebClient.builder().codecs({ configurer ->
                    configurer.defaultCodecs().jackson2JsonDecoder(new Jackson2JsonDecoder(WebClientBase.MAPPER));
                    configurer.defaultCodecs().jackson2JsonEncoder(new Jackson2JsonEncoder(WebClientBase.OUTMAPPER));
                    configurer.defaultCodecs().maxInMemorySize(getMaxInMemorySize());
                }).clientConnector(new ReactorClientHttpConnector(httpClient)).build();
            }
            return this.webClient2;
        }
    }
}
