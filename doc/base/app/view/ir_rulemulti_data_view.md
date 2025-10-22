# 规则(ir_rulemulti_data_view)  <!-- {docsify-ignore-all} -->


系统自动添加



## 控件
#### CAPTIONBAR(captionbar)
#### 数据表格(grid)
#### 搜索栏(searchbar)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [规则(IR_RULE)](module/base/ir_rule) : [表格界面_新建操作](module/base/ir_rule#界面行为)

### 关联视图
  * [规则(ir_rulemain_view)](app/view/ir_rulemain_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>