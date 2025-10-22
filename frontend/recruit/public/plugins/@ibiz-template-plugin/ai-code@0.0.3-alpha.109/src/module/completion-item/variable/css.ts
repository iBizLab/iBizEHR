/**
 * 样式变量代码，默认使用light主题变量
 */
export const cssVariableCode = `
:root.light {
    /* 功能色 */
    --ibiz-color-white: rgba(var(--ibiz-white), 1); /* 白色 */
    --ibiz-color-black: rgba(var(--ibiz-black), 1); /* 黑色 */

    /* 主要颜色 */
    --ibiz-color-primary: rgba(var(--ibiz-blue-cyan-4), 1); /* 主要颜色，仅在需要非常强调的情况下使用 */
    --ibiz-color-primary-text: rgba(var(--ibiz-white), 1); /* 主要颜色文字色，和背景色形成对比 */
    --ibiz-color-primary-hover: rgba(var(--ibiz-blue-cyan-3), 1); /* 主要颜色悬浮态 */
    --ibiz-color-primary-hover-text: rgba(var(--ibiz-white), 1); /* 主要颜色悬浮态文字色，和背景色形成对比 */
    --ibiz-color-primary-active: rgba(var(--ibiz-blue-cyan-5), 1); /* 主要颜色激活态 */
    --ibiz-color-primary-active-text: rgba(var(--ibiz-white), 1); /* 主要颜色激活态文字色，和背景色形成对比 */
    --ibiz-color-primary-disabled: rgba(var(--ibiz-blue-cyan-2), 1); /* 主要颜色禁用态 */
    --ibiz-color-primary-disabled-text: rgba(var(--ibiz-white), 1); /* 主要颜色禁用态文字色，和背景色形成对比 */
    --ibiz-color-primary-light-default: rgba(var(--ibiz-blue-cyan-0), 1); /* 浅版主要颜色（多用于背景） */
    --ibiz-color-primary-light-hover: rgba(var(--ibiz-blue-cyan-1), 1); /* 浅版主要颜色悬浮态 */
    --ibiz-color-primary-light-active: rgba(var(--ibiz-blue-cyan-2), 1); /* 浅版主要颜色激活态 */

    /* 次要颜色 */
    --ibiz-color-secondary: rgba(var(--ibiz-light-blue-5), 1); /* 次要颜色，强调作用次于主要颜色，但仍然具有强调作用 */
    --ibiz-color-secondary-text: rgba(var(--ibiz-white), 1); /* 次要颜色文字色，和背景色形成对比 */
    --ibiz-color-secondary-hover: rgba(var(--ibiz-light-blue-6), 1); /* 次要颜色悬浮态 */
    --ibiz-color-secondary-hover-text: rgba(var(--ibiz-white), 1); /* 次要颜色悬浮态文字色，和背景色形成对比 */
    --ibiz-color-secondary-active: rgba(var(--ibiz-light-blue-7), 1); /* 次要颜色激活态 */
    --ibiz-color-secondary-active-text: rgba(var(--ibiz-white), 1); /* 次要颜色激活态文字色，和背景色形成对比 */
    --ibiz-color-secondary-disabled: rgba(var(--ibiz-light-blue-2), 1); /* 次要颜色禁用态 */
    --ibiz-color-secondary-disabled-text: rgba(var(--ibiz-white), 1); /* 次要颜色禁用态文字色，和背景色形成对比 */
    --ibiz-color-secondary-light-default: rgba(var(--ibiz-light-blue-0), 1); /* 浅版次要颜色（多用于背景），强调作用次于主要颜色，但仍然具有强调作用 */
    --ibiz-color-secondary-light-hover: rgba(var(--ibiz-light-blue-1), 1); /* 浅版次要颜色悬浮态 */
    --ibiz-color-secondary-light-active: rgba(var(--ibiz-light-blue-2), 1); /* 浅版次要颜色激活态 */

    /* 第三颜色 */
    --ibiz-color-tertiary: rgba(var(--ibiz-grey-5), 1); /* 第三颜色，可以在页面上多次使用 */
    --ibiz-color-tertiary-text: rgba(var(--ibiz-white), 1); /* 第三颜色文字色，和背景色形成对比 */
    --ibiz-color-tertiary-hover: rgba(var(--ibiz-grey-4), 1); /* 第三颜色悬浮态 */
    --ibiz-color-tertiary-hover-text: rgba(var(--ibiz-white), 1); /* 第三颜色悬浮态文字色，和背景色形成对比 */
    --ibiz-color-tertiary-active: rgba(var(--ibiz-grey-6), 1); /* 第三颜色激活态 */
    --ibiz-color-tertiary-active-text: rgba(var(--ibiz-white), 1); /* 第三颜色激活态文字色，和背景色形成对比 */
    --ibiz-color-tertiary-light-default: rgba(var(--ibiz-grey-0), 1); /* 浅版第三颜色（多用于背景），可以在页面上多次使用 */
    --ibiz-color-tertiary-light-hover: rgba(var(--ibiz-grey-1), 1); /* 浅版第三颜色悬浮态 */
    --ibiz-color-tertiary-light-active: rgba(var(--ibiz-grey-2), 1); /* 浅版第三颜色激活态 */

    /* 信息色 */
    --ibiz-color-info: rgba(var(--ibiz-blue-cyan-4), 1); /* 信息色, 通常用于表达客观、中立信息 */
    --ibiz-color-info-text: rgba(var(--ibiz-white), 1); /* 信息颜色文字色，和背景色形成对比 */
    --ibiz-color-info-hover: rgba(var(--ibiz-blue-cyan-3), 1); /* 信息色悬浮态 */
    --ibiz-color-info-hover-text: rgba(var(--ibiz-white), 1); /* 信息颜色悬浮态文字色，和背景色形成对比 */
    --ibiz-color-info-active: rgba(var(--ibiz-blue-cyan-5), 1); /* 信息色激活态 */
    --ibiz-color-info-active-text: rgba(var(--ibiz-white), 1); /* 信息颜色激活态文字色，和背景色形成对比 */
    --ibiz-color-info-disabled: rgba(var(--ibiz-blue-cyan-2), 1); /* 信息色禁用态 */
    --ibiz-color-info-disabled-text: rgba(var(--ibiz-white), 1); /* 信息颜色禁用态文字色，和背景色形成对比 */
    --ibiz-color-info-light-default: rgba(var(--ibiz-blue-cyan-0), 1); /* 浅版信息色（多用于背景），通常用于表达客观、中立信息 */
    --ibiz-color-info-light-hover: rgba(var(--ibiz-blue-cyan-1), 1); /* 浅版信息色悬浮态 */
    --ibiz-color-info-light-active: rgba(var(--ibiz-blue-cyan-2), 1); /* 浅版信息色激活态 */

    /* 成功色 */
    --ibiz-color-success: rgba(var(--ibiz-green-5), 1); /* 成功色，表示安全、成功、开启的状态 */
    --ibiz-color-success-text: rgba(var(--ibiz-white), 1); /* 成功颜色文字色，和背景色形成对比 */
    --ibiz-color-success-hover: rgba(var(--ibiz-green-4), 1); /* 成功色悬浮态 */
    --ibiz-color-success-hover-text: rgba(var(--ibiz-white), 1); /* 成功颜色悬浮态文字色，和背景色形成对比 */
    --ibiz-color-success-active: rgba(var(--ibiz-green-6), 1); /* 成功色激活态 */
    --ibiz-color-success-active-text: rgba(var(--ibiz-white), 1); /* 成功颜色激活态文字色，和背景色形成对比 */
    --ibiz-color-success-disabled: rgba(var(--ibiz-green-2), 1); /* 成功色禁用态 */
    --ibiz-color-success-disabled-text: rgba(var(--ibiz-white), 1); /* 成功颜色禁用态文字色，和背景色形成对比 */
    --ibiz-color-success-light-default: rgba(var(--ibiz-green-0), 1); /* 浅版成功色（多用于背景），表示安全、成功、开启的状态 */
    --ibiz-color-success-light-hover: rgba(var(--ibiz-green-1), 1); /* 浅版成功色悬浮态 */
    --ibiz-color-success-light-active: rgba(var(--ibiz-green-2), 1); /* 浅版成功色激活态 */

    /* 警示色 */
    --ibiz-color-warning: rgba(var(--ibiz-orange-5), 1); /* 警示色，表示警告、不安全的状态 */
    --ibiz-color-warning-text: rgba(var(--ibiz-white), 1); /* 警示颜色文字色，和背景色形成对比 */
    --ibiz-color-warning-hover: rgba(var(--ibiz-orange-4), 1); /* 警示色悬浮态 */
    --ibiz-color-warning-hover-text: rgba(var(--ibiz-white), 1); /* 警示颜色悬浮态文字色，和背景色形成对比 */
    --ibiz-color-warning-active: rgba(var(--ibiz-orange-6), 1); /* 警示色激活态 */
    --ibiz-color-warning-active-text: rgba(var(--ibiz-white), 1); /* 警示颜色激活态文字色，和背景色形成对比 */
    --ibiz-color-warning-light-default: rgba(var(--ibiz-orange-0), 1); /* 浅版警示色（多用于背景），表示警告、不安全的状态 */
    --ibiz-color-warning-light-hover: rgba(var(--ibiz-orange-1), 1); /* 浅版警示色悬浮态 */
    --ibiz-color-warning-light-active: rgba(var(--ibiz-orange-2), 1); /* 浅版警示色激活态 */

    /* 危险色 */
    --ibiz-color-danger: rgba(var(--ibiz-red-5), 1); /* 危险色，表示危险的操作、或需要特别注意的危险信息 */
    --ibiz-color-danger-text: rgba(var(--ibiz-white), 1); /* 危险颜色文字色，和背景色形成对比 */
    --ibiz-color-danger-hover: rgba(var(--ibiz-red-4), 1); /* 危险色悬浮态 */
    --ibiz-color-danger-hover-text: rgba(var(--ibiz-white), 1); /* 危险颜色悬浮态文字色，和背景色形成对比 */
    --ibiz-color-danger-active: rgba(var(--ibiz-red-6), 1); /* 危险色激活态 */
    --ibiz-color-danger-active-text: rgba(var(--ibiz-white), 1); /* 危险颜色激活态文字色，和背景色形成对比 */
    --ibiz-color-danger-light-default: rgba(var(--ibiz-red-0), 1); /* 浅版危险色（多用于背景），表示危险的操作、或需要特别注意的危险信息 */
    --ibiz-color-danger-light-hover: rgba(var(--ibiz-red-1), 1); /* 浅版危险色悬浮态 */
    --ibiz-color-danger-light-active: rgba(var(--ibiz-red-2), 1); /* 浅版危险色激活态 */

    /* 文本/图标颜色 */
    --ibiz-color-text-0: rgba(var(--ibiz-grey-9), 1); /* 文本/图标颜色 - 最主要 */
    --ibiz-color-text-1: rgba(var(--ibiz-grey-7), 1); /* 文本/图标颜色 - 稍次要 */
    --ibiz-color-text-2: rgba(var(--ibiz-grey-6), 1); /* 文本/图标颜色 - 次要 */
    --ibiz-color-text-3: rgba(var(--ibiz-grey-4), 1); /* 文本/图标颜色 - 最次要 */
    --ibiz-color-text-5: #dbe4ec; /* 文本色(特殊) - 应用搜索框使用 */
    --ibiz-color-text-menu: #dbe4ec; /* 文本 - 特殊-菜单颜色 */

    /* 图标颜色 */
    --ibiz-color-icon-0: #65b3fc; /* 图标颜色 - 最主要 */
    --ibiz-color-icon-1: #cbe7fe; /* 图标颜色 - 次要 */

    /* 链接颜色 */
    --ibiz-color-link: rgba(var(--ibiz-blue-cyan-5), 1); /* 链接颜色，通常用于a标签颜色 */
    --ibiz-color-link-hover: rgba(var(--ibiz-blue-cyan-4), 1); /* 链接颜色 - 悬浮态 */
    --ibiz-color-link-active: rgba(var(--ibiz-blue-cyan-6), 1); /* 链接颜色 - 激活态 */
    --ibiz-color-link-visited: rgba(var(--ibiz-blue-cyan-5), 1); /* 链接颜色 - 已访问 */

    /* 背景色 */
    --ibiz-color-bg-0: rgba(var(--ibiz-grey-0), 1); /* 背景色 - 最下层（底部页面） */
    --ibiz-color-bg-1: rgba(var(--ibiz-white), 1); /* 背景色 - 次下层（页面中需要提升的内容） */
    --ibiz-color-bg-2: rgba(var(--ibiz-white), 1); /* 背景色 - 中间层（模态等容器） */
    --ibiz-color-bg-3: rgba(var(--ibiz-white), 1); /* 背景色 - 次上层（通知，Toast等） */
    --ibiz-color-bg-4: rgba(var(--ibiz-white), 1); /* 背景色 - 最上层（特殊） */
    --ibiz-color-bg-5: rgba(var(--ibiz-blue-cyan-3), 0.6); /* 背景色(特殊) - 应用搜索框使用 */
    --ibiz-color-bg-overlay: rgba(var(--ibiz-black), 0.5); /* 蒙层背景色 */

    /* 填充色 */
    --ibiz-color-fill-0: rgba(var(--ibiz-grey-8), 0.05); /* 填充色 - 默认态 */
    --ibiz-color-fill-1: rgba(var(--ibiz-grey-8), 0.1); /* 填充色 - 悬浮态 */
    --ibiz-color-fill-2: rgba(var(--ibiz-grey-8), 0.13); /* 填充色 - 激活态 */
    --ibiz-color-scroll-menu: rgba(132,165,198,.4); /* 填充色 - 特殊-菜单滚动条颜色 */

    /* 边框 */
    --ibiz-color-border: rgba(var(--ibiz-grey-9), 0.1); /* 默认描边颜色 */

    /* 禁用态 */
    --ibiz-color-disabled-text: rgba(var(--ibiz-grey-9), 0.35); /* 禁用态 - 文字 */
    --ibiz-color-disabled-border: rgba(var(--ibiz-grey-1), 1); /* 禁用态 - 描边 */
    --ibiz-color-disabled-bg: rgba(var(--ibiz-grey-1), 1); /* 禁用态 - 背景 */
    --ibiz-color-disabled-fill: rgba(var(--ibiz-grey-8), 0.04); /* 禁用态 - 填充 */

    /* 阴影 */
    --ibiz-color-shadow: rgba(var(--ibiz-black), 0.04); /* 用于模拟描边的阴影颜色 */
    --ibiz-shadow-elevated: 0 0 1px rgba(0,0,0,.3),0 4px 14px rgba(0,0,0,.1); /* 用于toast, modal, popover等需要提升层级的界面元素 */

    /* 字号 */
    --ibiz-font-size-small: 12px; /* 小字体，用于辅助说明、状态提示等 */
    --ibiz-font-size-regular: 14px; /* 常规字体，页面主体文本默认大小 */
    --ibiz-font-size-header-6: 16px; /* 标题6级，次级标题或段落小标题 */
    --ibiz-font-size-header-5: 18px; /* 标题5级，中等标题，用于章节分隔 */
    --ibiz-font-size-header-4: 20px; /* 标题4级，主要标题，突出内容层级 */
    --ibiz-font-size-header-3: 24px; /* 标题3级，较大标题，用于页面主标题 */
    --ibiz-font-size-header-2: 28px; /* 标题2级，特大标题，强调核心内容 */
    --ibiz-font-size-header-1: 32px; /* 标题1级，最大标题，用于页面核心标题或标语 */

    /* 字重 */
    --ibiz-font-weight-light: 200; /* 细字体，用于次要文本或提示信息 */
    --ibiz-font-weight-regular: 400; /* 常规字重，页面主体文本默认粗细 */
    --ibiz-font-weight-bold: 800; /* 粗字体，用于标题、按钮文本或需要强调的内容 */

    /* 圆角 */
    --ibiz-border-radius-extra-small: 2px; /* 超小圆角，用于 checkbox 内圆角 */
    --ibiz-border-radius-small: 4px; /* 小圆角, 用于 button、tag、tabs 等大多数组件, 比较常用 */
    --ibiz-border-radius-medium: 8px; /* 中圆角, 用于 dropdown、scrollist、transfer 等菜单类组件 */
    --ibiz-border-radius-large: 12px; /* 大圆角, 用于 modal */
    --ibiz-border-radius-circle: 50%; /* 全圆角, 用于 avatar, badge 等组件 */
    --ibiz-border-radius-full: 9999px; /* 用于创建全尺寸圆角，如胶囊标签等 */

    /* 高度 */
    --ibiz-height-control-small: 24px; /* 小型控件高度，如小尺寸按钮、输入框 */
    --ibiz-height-control-default: 32px; /* 默认控件高度，适用于大多数按钮、输入框 */
    --ibiz-height-control-large: 40px; /* 大型控件高度，用于需要突出显示的按钮或输入框 */

    /* 描边尺寸 */
    --ibiz-border-thickness: 0; /* 无边框，用于隐藏默认描边 */
    --ibiz-border-thickness-control: 1px; /* 控件默认描边宽度，如按钮、输入框边框 */
    --ibiz-border-thickness-control-focus: 1px; /* 控件聚焦时的描边宽度，通常配合颜色变化突出状态 */

    /* 图标尺寸 */
    --ibiz-width-icon-extra-small: 8px; /* 超小图标，用于状态点、微小装饰 */
    --ibiz-width-icon-small: 12px; /* 小图标，用于按钮内小图标、列表项辅助图标 */
    --ibiz-width-icon-medium: 16px; /* 中等图标，页面常规图标尺寸（默认） */
    --ibiz-width-icon-large: 20px; /* 大图标，用于功能区按钮、卡片主图标 */
    --ibiz-width-icon-extra-large: 24px; /* 特大图标，用于页面主视觉图标或突出功能图标 */

    /* 间距 */
    --ibiz-spacing-none: 0; /* 无间距，元素紧贴 */
    --ibiz-spacing-super-tight: 2px; /* 超紧密间距，用于微交互元素 */
    --ibiz-spacing-extra-tight: 4px; /* 紧密间距，组件内元素间微小间隔 */
    --ibiz-spacing-tight: 8px; /* 较紧密间距，按钮组、标签间距 */
    --ibiz-spacing-base-tight: 12px; /* 基础紧密间距，列表项内间距 */
    --ibiz-spacing-base: 16px; /* 基准间距，页面常规元素间距（默认） */
    --ibiz-spacing-base-loose: 20px; /* 基础宽松间距，卡片内内容间距 */
    --ibiz-spacing-loose: 24px; /* 宽松间距，区块间间距、段落间距 */
    --ibiz-spacing-extra-loose: 32px; /* 超宽松间距，页面主要模块分隔 */
    --ibiz-spacing-super-loose: 40px; /* 最大间距，页面头部/底部与内容区间隔 */
}
`;
