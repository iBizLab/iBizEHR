# 系统角色(Role)  <!-- {docsify-ignore-all} -->


角色映射实体


## 属性
|    中文名col150 | 属性名称col200           | 类型col200     | 长度col100    |允许为空col100    |  备注col500  |
| --------   |------------| -----  | -----  | :----: | -------- |
|授权全部用户|AUTHORIZEALL|是否逻辑||是||
|建立时间|CREATEDATE|日期时间型|8|否||
|建立人|CREATEMAN|文本，可指定长度|60|否||
|租户系统标识|DCSYSTEMID|文本，可指定长度|100|是||
|全局标记|GLOBALFLAG|是否逻辑|100|是||
|备注|MEMO|长文本，长度1000|1000|是||
|父角色标识|PROLEID|文本，可指定长度|100|是||
|角色标识|ROLETAG|文本，可指定长度|100|是||
|系统标记|SYSTEMFLAG|是否逻辑|100|是||
|角色标识<sup class="footnote-symbol"><font color=orange>[PK]</font></sup>|SYS_ROLEID|全局唯一标识，文本类型，用户不可见|100|否||
|角色名称|SYS_ROLENAME|文本，可指定长度|200|是||
|更新时间|UPDATEDATE|日期时间型|8|否||
|更新人|UPDATEMAN|文本，可指定长度|60|否||
|用户模式|USERMODE|单项选择(文本值)|60|是||


## 行为
| 中文名col200    | 代码名col150    | 类型col150    | 事务col100   | 批处理col100   | 附加操作col100  | 插件col150    |  备注col300  |
| -------- |---------- |----------- |:----:|:----:|---------| ----- | ----- |

## 搜索模式
|   搜索表达式col350   |    属性名col200    |    搜索模式col200        |备注col500  |
| -------- |------------|------------|------|
|N_SYS_ROLEID_EQ|角色标识|EQ||

<div style="display: block; overflow: hidden; position: fixed; top: 140px; right: 100px;">

##### 导航
<el-anchor >
<el-anchor-link :href="`#/module/ebsx/Role?id=属性`">
  属性
</el-anchor-link>
<el-anchor-link :href="`#/module/ebsx/Role?id=行为`">
  行为
</el-anchor-link>
<el-anchor-link :href="`#/module/ebsx/Role?id=搜索模式`">
  搜索模式
</el-anchor-link>
</el-anchor>
</div>

<script>
 const { createApp } = Vue
  createApp({
    data() {
      return {



      }
    },
    methods: {
    }
  }).use(ElementPlus).mount('#app')
</script>