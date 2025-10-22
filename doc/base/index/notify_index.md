# 消息通知 <!-- {docsify-ignore-all} -->


## 消息队列

|    中文名col200   | 代码名col200       |  类型col100     |  备注col750  |
| --------|------------| -----   |  -------- |
|默认消息队列|Default|Runtime||

## 实体消息通知

|    实体col200|    通知名称col200          |  消息模板col300   |  使用场景col250    |  备注col300  |
| --------|------------ |   -------- | -------- | -------- |
|[消息(MAIL_MESSAGE)](module/mail/mail_message)|[评论通知(message_notify)](module/mail/mail_message/notify/message_notify)|[消息通知模板](#mail_notify_templ)|[新建评论后通知(after_create_notify)](module/mail/mail_message/logic/after_create_notify)||

## 通知目标

|    中文名col200   | 代码名col200       |  目标类型col150  | 数据集合col200   |  备注col500  |
| --------|------------| -----   |  -------- | -------- |
|评论通知关注人|mail_message_attention|实体数据集|[评论提醒(mail_message_attention)](module/mail/mail_followers/dataset/mail_message_attention)||

## 消息模板

#### 消息通知模板(mail_notify_templ) :id=mail_notify_templ


模板类型：`静态`

模板引擎：`Groovy`

内容类型：`HTML网页`

超链接：`<#if data.parent("owner_id")??>
view://work_item_dyna_main_view?
srfnavctx={"work_item":"${data.parent("owner_id").id}","project":"${data.parent("owner_id").project_id}","srfdatatype" : "${data.parent("owner_id").work_item_type_id}",
"space": null, "article_page": null, "product": null,"idea": null, "customer": null, "ticket": null, "library": null, "test_case": null, "run": null }&srfdatatype=${data.parent("owner_id").work_item_type_id}</#if>`

移动端超链接：`<#if data.parent("owner_id")??>
view://work_item_mob_common_edit_view?
srfnavctx={"work_item":"${data.parent("owner_id").id}","project":"${data.parent("owner_id").project_id}","srfdatatype" : "${data.parent("owner_id").work_item_type_id}",
"space": null, "article_page": null, "product": null,"idea": null, "customer": null, "ticket": null, "library": null, "test_case": null, "run": null }&srfdatatype=${data.parent("owner_id").work_item_type_id}</#if>`

内容：
```
<div class="notice-card" style="display: flex; align-items: flex-start;">
			    <div class="notice-card__avatar" style="flex-shrink: 0;">
			        <span class="notice-card__avatar-icon" style="background-color: skyblue; border-radius: 50%; margin-right: 10px; width: 36px; height: 36px; display: flex; justify-content: center; align-items: center; font-size: 10px;">${data.update_mantext?substring(0,2)!}</span>
			    </div>
			    <div class="notice-card__content" style="flex-grow: 1;width: calc(100% - 46px);">
			        <div class="notice-card__event">
			            <div class="notice-card__event-title" style="font-size: 14px; color: #000;">
	<span class="notice-card__event-name" style="color: #999; font-size: 14px; text-transform: lowercase; display: inline-block; max-width: 100%; overflow: hidden; text-overflow: ellipsis; white-space: nowrap;">${data.update_mantext}</span> 
<span class="notice-card__event-name" style="font-size: 14px; text-transform: lowercase; display: inline-block; max-width: 100%; overflow: hidden; text-overflow: ellipsis; white-space: nowrap;">提醒你关注<#if data.owner_type == 'WORK_ITEM'>${data.parent("owner_id").work_item_type_name}<#elseif data.owner_type == 'IDEA'>需求<#elseif data.owner_type== 'TICKET'>工单<#elseif data.owner_type== 'TEST_CASE'>测试用例<#elseif data.owner_type == 'CUSTOMER'>客户<#elseif data.owner_type == 'RUN'>执行用例<#elseif data.owner_type == 'PAGE'>页面</#if></span></div>
        </div>
<#if data.parent("owner_id")??>
<#assign parent= data.parent("owner_id")>
        <div class="notice-card-object" style="display: inline-block;white-space: nowrap;overflow: hidden;text-overflow: ellipsis;width: 100%;">
<span class="notice-card__object-id" style="color: #999; font-size: 14px;"><#if parent.show_identifier??>${parent.show_identifier}</#if></span>
<#if data.owner_type == 'CUSTOMER' || data.owner_type == 'PAGE'>
<span class="object-name" title="${parent.name}"> ${parent.name}</span>
<#else>
<span class="object-name" title="${parent.title}"> ${parent.title}</span></#if>

        </div>
    <#if parent.parent("project_id")??>
    <#assign project= parent.parent("project_id")>
        <div class="notice-card-pilot" style="font-size: 12px;color: #999;text-transform: lowercase;white-space: nowrap;overflow: hidden;text-overflow: ellipsis;"><span class="notice-time">${data.update_time?string("yyyy-MM-dd HH:mm:ss")}</span><span class="notice-pilot-info">· 项目管理 · ${project.name}</span></div>
    <#elseif parent.parent("product_id")??>
        <#assign product= parent.parent("product_id")>
  <div class="notice-card-pilot" style="font-size: 12px;color: #999;text-transform: lowercase;white-space: nowrap;overflow: hidden;text-overflow: ellipsis;"><span class="notice-time">${data.update_time?string("yyyy-MM-dd HH:mm:ss")}</span><span class="notice-pilot-info">· 产品管理 · ${product.name}</span></div>
    <#elseif parent.parent("plan_id")??>
        <#assign plan = parent.parent("plan_id")>
  <div class="notice-card-pilot" style="font-size: 12px;color: #999;text-transform: lowercase;white-space: nowrap;overflow: hidden;text-overflow: ellipsis;"><span class="notice-time">${data.update_time?string("yyyy-MM-dd HH:mm:ss")}</span><span class="notice-pilot-info">· 测试管理 · ${plan.library_name}</span></div>
    <#elseif parent.parent("test_library_id")??>
        <#assign library= parent.parent("test_library_id")>
  <div class="notice-card-pilot" style="font-size: 12px;color: #999;text-transform: lowercase;white-space: nowrap;overflow: hidden;text-overflow: ellipsis;"><span class="notice-time">${data.update_time?string("yyyy-MM-dd HH:mm:ss")}</span><span class="notice-pilot-info">· 测试管理 · ${library.name}</span></div>
    </#if>
    </div>
    </#if>
</div>
```

即时消息内容：
```
${data.update_mantext}提醒你关注<#if data.owner_type == 'WORK_ITEM'>${data.parent("owner_id").work_item_type_name}<#elseif data.owner_type == 'IDEA'>需求<#elseif data.owner_type == 'TICKET'>工单<#elseif data.owner_type == 'TEST_CASE'>测试用例<#elseif data.owner_type == 'CUSTOMER'>客户<#elseif data.owner_type == 'RUN'>执行用例</#if>：
<#if data.owner_type == 'CUSTOMER'>${data.parent("owner_id").name}<#else>${data.parent("owner_id").title}</#if>
```

短信内容：
```
${data.update_mantext}提醒你关注<#if data.owner_type == 'WORK_ITEM'>${data.parent("owner_id").work_item_type_name}<#elseif data.owner_type == 'IDEA'>需求<#elseif data.owner_type == 'TICKET'>工单<#elseif data.owner_type == 'TEST_CASE'>测试用例<#elseif data.owner_type == 'CUSTOMER'>客户<#elseif data.owner_type == 'RUN'>执行用例</#if>：
<#if data.owner_type == 'CUSTOMER'>${data.parent("owner_id").name}<#else>${data.parent("owner_id").title}</#if>
```

钉钉内容：
```
${data.update_mantext}提醒你关注<#if data.owner_type == 'WORK_ITEM'>${data.parent("owner_id").work_item_type_name}<#elseif data.owner_type == 'IDEA'>需求<#elseif data.owner_type == 'TICKET'>工单<#elseif data.owner_type == 'TEST_CASE'>测试用例<#elseif data.owner_type == 'CUSTOMER'>客户<#elseif data.owner_type == 'RUN'>执行用例</#if>：
<#if data.owner_type == 'CUSTOMER'>${data.parent("owner_id").name}<#else>${data.parent("owner_id").title}</#if>
```

微信消息内容：
```
${data.update_mantext}提醒你关注<#if data.owner_type == 'WORK_ITEM'>${data.parent("owner_id").work_item_type_name}<#elseif data.owner_type == 'IDEA'>需求<#elseif data.owner_type == 'TICKET'>工单<#elseif data.owner_type == 'TEST_CASE'>测试用例<#elseif data.owner_type == 'CUSTOMER'>客户<#elseif data.owner_type == 'RUN'>执行用例</#if>：
<#if data.owner_type == 'CUSTOMER'>${data.parent("owner_id").name}<#else>${data.parent("owner_id").title}</#if>
```
