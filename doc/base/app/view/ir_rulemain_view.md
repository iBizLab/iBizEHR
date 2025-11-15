# 规则(ir_rulemain_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)
#### 工具栏(toolbar1)

## 视图界面逻辑
* `onMounted`
```javascript
ibiz.uiDomainManager.get(view.context.srfsessionid).evt.on("stateChange", async  (state, isTrusted )=> {
    console.log("");
    const data = view.getController("form").getData()[0];
// 获取应用实例
const app = ibiz.hub.getApp(context.srfappid);
// 获取指定实体服务
const deService = await app.deService.getService(
    context,
    "ehrapp.rule_group_rel", // 实体标识
);
const ruleGroupRelList = deService.local.getList();
if(ruleGroupRelList.length > 0) {
    data.global=0;
}else{
    data.global=1;
}
});


```


### 关联界面行为
  * [规则(IR_RULE)](module/base/ir_rule) : [取消变更](module/base/ir_rule#界面行为)
  * [规则(IR_RULE)](module/base/ir_rule) : [编辑界面_保存并新建操作](module/base/ir_rule#界面行为)
  * [规则(IR_RULE)](module/base/ir_rule) : [编辑界面_保存操作](module/base/ir_rule#界面行为)

### 关联视图
  * [权限组关联规则(rule_group_relnested_rule_grid_view)](app/view/rule_group_relnested_rule_grid_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>