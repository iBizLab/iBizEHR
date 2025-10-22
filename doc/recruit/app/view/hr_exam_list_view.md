# 考试/评测(hr_exam_list_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### 列表(list)
#### 搜索栏(searchbar)
#### 搜索表单(searchform)
#### 工具栏(toolbar)

## 视图界面逻辑
  * newdata(预置新建数据逻辑)
  * opendata(预置打开数据逻辑)


### 关联界面行为
  * [考试/测评(HR_EXAM)](module/hr/hr_exam) : [添加考试测评](module/hr/hr_exam#界面行为)

### 关联视图
  * [考试/测评(hr_exam_edit_view)](app/view/hr_exam_edit_view)
  * [添加考试/评测(hr_exam_quick_create_view)](app/view/hr_exam_quick_create_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>