# 部门选择树(user_object_dept_pickup_tree_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 搜索栏(searchbar)
#### 树视图(tree)

## 视图界面逻辑
* `onSelectionChange`
```javascript
view.evt.emit('onSelectionChange', { data });
```


<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>