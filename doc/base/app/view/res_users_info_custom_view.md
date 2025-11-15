# 用户信息自定义视图(res_users_info_custom_view)  <!-- {docsify-ignore-all} -->



## 控件
#### CAPTIONBAR(captionbar)


### 关联界面行为
  * [用户(RES_USERS)](module/base/res_users) : [应用登出](module/base/res_users#界面行为)
  * [用户(RES_USERS)](module/base/res_users) : [主题设置](module/base/res_users#界面行为)
  * [用户(RES_USERS)](module/base/res_users) : [打开用户个人信息界面](module/base/res_users#界面行为)

### 关联视图
  * [用户(res_userspersonal_view)](app/view/res_userspersonal_view)

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {

      }
    }
  }).use(ElementPlus).mount('#app')
</script>