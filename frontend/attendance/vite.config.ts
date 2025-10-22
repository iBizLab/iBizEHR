import { defineConfig } from 'vite';
import path from 'path';
import vue from '@vitejs/plugin-vue';
import vueJsx from '@vitejs/plugin-vue-jsx';
import eslint from 'vite-plugin-eslint';
import legacy from '@vitejs/plugin-legacy';
// import { visualizer } from 'rollup-plugin-visualizer'; // 打包内容分析
import IBizVitePlugin from './vite-plugins/ibiz-vite-plugin';

/**
 * 判断是否为自定义标签
 *
 * @author chitanda
 * @date 2023-01-03 16:01:00
 * @param {string} tag
 * @return {*}  {boolean}
 */
function isCustomElement(tag: string): boolean {
  return tag.startsWith('ion-');
}

// https://vitejs.dev/config/
export default defineConfig({
  base: './',
  resolve: {
    alias: {
      '@': path.resolve(__dirname, 'src'),
    },
  },
  optimizeDeps: {
    entries: [
      '@floating-ui/dom',
      '@ibiz-template/core',
      '@ibiz-template/model-helper',
      '@ibiz-template/runtime',
      '@ibiz-template/them',
      '@ibiz-template/vue3-components',
      '@ibiz-template/vue3-util',
      '@ibiz-template/web-theme',
      '@ibiz/model-core',
      '@imengyu/vue3-context-menu',
      '@monaco-editor/loader',
      '@wangeditor/editor',
      '@wangeditor/editor-for-vue',
      'async-validator',
      'cherry-markdown',
      'dayjs',
      'echarts',
      'element-plus',
      'file-saver',
      'lodash-es',
      'monaco-editor',
      'nprogress',
      'path-browserify',
      'vue-grid-layout',
      'pinia',
      'qs',
      'qx-util',
      'ramda',
      'vue',
      'vue-i18n',
      'vue-router',
      'vue-text-format',
      'vuedraggable',
      'xlsx',
      'interactjs',
      '@ibiz-template-plugin/ai-chat',
    ],
  },
  build: {
    rollupOptions: {
      external: [
        'vue',
        'vue-router',
        'vue-i18n',
        'element-plus',
        'async-validator',
        'dayjs',
        'interactjs',
        'echarts',
        'axios',
        'qs',
        'ramda',
        'lodash-es',
        'qx-util',
        'vuedraggable',
        'pinia',
        '@floating-ui/dom',
        'vue-grid-layout',
        '@imengyu/vue3-context-menu',
        '@wangeditor/editor',
        '@wangeditor/editor-for-vue',
        '@ibiz-template/core',
        '@ibiz-template/runtime',
        '@ibiz-template/vue3-util',
        '@ibiz-template/model-helper',
        '@ibiz-template/vue3-components',
        '@ibiz-template-plugin/ai-chat',
        '@ibiz-template-plugin/bi-report',
      ],
      output: {
         entryFileNames: 'static/js/[name]-[hash].js',
        // 代码分割 chunk 路径映射
        chunkFileNames: (chunkInfo) => {
          const facadeModuleId = chunkInfo.facadeModuleId;
          const modelIndex = facadeModuleId.indexOf('/publish/model');
          if (modelIndex !== -1) {
            const relativePath = path.relative('src', facadeModuleId).replace(/\.\w+$/, '')
            const targetPath = relativePath.slice(relativePath.indexOf('/')); // 去除publish目录
            return `static/js/${targetPath}.js`;
          }
          return 'static/js/ui/[name]-[hash].js';
        },

        // 静态资源路径保持与 src 一致
        assetFileNames: (assetInfo) => {
          const extType = path.extname(assetInfo.name).slice(1);
          if (/\.(css|scss)$/.test(assetInfo.name)) {
            if(assetInfo.name === 'index.css'){
              return `static/css/[name].${extType}`;
            }else{
               return `static/css/[name]-[hash].${extType}`;
            }
          }
          return `static/[ext]/[name]-[hash].[ext]`;
        }
      }
    },
  },
  server: {
    host: '0.0.0.0',
    proxy: {
      // '/api/ibizplm__plmweb': {
      //   target: 'http://172.16.220.130:30510',
      //   changeOrigin: true,
      // },
    },
    cors: true,
    fs: {
      strict: false,
    },
  },
  css: {
    preprocessorOptions: {
      scss: {
        additionalData: '@import "@ibiz-template/theme/style/global.scss";',
      },
    },
  },
  plugins: [
    eslint({
      include: 'src/**/*.{ts,tsx,js,jsx}',
    }),
    vue({
      template: {
        compilerOptions: {
          isCustomElement,
        },
      },
    }),
    vueJsx({
      isCustomElement,
    }),
    legacy({ externalSystemJS: true }),
    IBizVitePlugin(),
    // visualizer(),
  ],
});
