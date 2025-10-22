# 考勤统计(attendance_statistics_edit_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)

##### 部件逻辑
* `onLoadSuccess`
```
const cacheKeys = ['base_info', 'attendance','abnormal', 'leave', 'daily'];
if (ctrl.view) {
    const storageTag = `${ctrl.view.model.codeName}_checkListCache`;
    const value = localStorage.getItem(storageTag);
    if (value) {
        const tempData = JSON.parse(value);
        cacheKeys.forEach(key => {
            ctrl.setDataValue(tempData[key], key);
        })
    }
}
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