# 候选人申请(hr_applicant_interview_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)
#### DATAINFOBAR(datainfobar)
#### 编辑表单(form)
#### 工具栏(toolbar)


### 关联界面行为
  * [候选人申请(HR_APPLICANT)](module/hr/hr_applicant) : [发送评论](module/hr/hr_applicant#界面行为)
  * [候选人申请(HR_APPLICANT)](module/hr/hr_applicant) : [清空评论](module/hr/hr_applicant#界面行为)

### 关联界面逻辑
  * [评论(COMMENT)](module/base/comment) : [控制评论按钮显示](module/base/comment/uilogic/comment_icon_show)
  * [评论(COMMENT)](module/base/comment) : [控制评论按钮隐藏](module/base/comment/uilogic/comment_icon_hidden)

### 关联视图
  * [评论(comment_list_view)](app/view/comment_list_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>