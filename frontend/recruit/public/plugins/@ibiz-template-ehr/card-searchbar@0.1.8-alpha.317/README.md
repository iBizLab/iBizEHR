# 搜索栏插件

搜索栏插件可自定义搜索栏内容的绘制，当标准逻辑无法满足搜索栏绘制要求时，可以通过搜索栏插件来实现。modeling建模平台创建搜索栏插件可参见 [插件开发](https://open.ibizlab.cn/apphub/zh/guide/plugin-dev.html)

## 插件结构

```
|─ ─ card-searchbar                        搜索栏插件顶层目录
  |─ ─ src                                 搜索栏插件源代码目录
​    |─ ─ card-searchbar.controller.ts      搜索栏插件控制器
​    |─ ─ card-searchbar.provider.ts        搜索栏插件适配器
​    |─ ─ card-searchbar.scss               搜索栏插件样式
​    |─ ─ card-searchbar.tsx                搜索栏插件组件
​    |─ ─ index.ts                          搜索栏插件入口文件
```

- 搜索栏插件入口文件

搜索栏插件入口文件会全局注册搜索栏插件适配器和搜索栏插件组件，供外部使用。

- 搜索栏插件组件

搜索栏插件组件使用tsx的书写方式，承载搜索栏绘制的内容。

- 搜索栏插件适配器

搜索栏插件适配器主要通过component属性指定搜索栏实际要绘制的组件，并且通过createController方法返回传递给搜索栏的控制器。

- 搜索栏插件控制器

搜索栏插件控制器承载搜索栏的逻辑控制。

## 本地开发

1. 安装依赖并link至全局

```sh
// 安装依赖
pnpm i

// link底包
./scripts/link.sh

// 启动
pnpm dev

// link到全局
pnpm link --global
```

2. 主项目包中引用插件

```sh
// link插件
pnpm link --global '@ibiz-template-ehr/card-searchbar'
```

3. 主项目包中注册插件

```ts
import { App } from 'vue';
import CardSearchbar from '@ibiz-template-ehr/card-searchbar';

export default {
  install(app: App): void {
    app.use(CardSearchbar);
    // 设置本地开发需要忽略加载的插件，可填写正则或全匹配字符串。匹配插件在modeling建模平台配置的[运行时插件仓库配置]内容
    ibiz.plugin.setDevIgnore(/^@ibiz-template-ehr\/card-searchbar/);
  },
};
```
