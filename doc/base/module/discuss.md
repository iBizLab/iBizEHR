# 讨论(discuss) <!-- {docsify-ignore-all} -->



### 实体

|    名称col200   | 代码名col150      |  实体类型col150   | 存储模式col100 | 表名称col200   |    联合主键col100   |  主状态col100   |  权限控制col150  |  启用审计col100    |  备注col500  |
| --------  |------------| -----   |  --------|  --------|  --------|    -------- | -------- | -------- |-------- |
|[讨论频道(DISCUSS_CHANNEL)](module/discuss/discuss_channel)|discuss_channel|主实体|SQL|discuss_channel|否|否|自控制|否||
|[频道成员(DISCUSS_CHANNEL_MEMBER)](module/discuss/discuss_channel_member)|discuss_channel_member|主实体|SQL|discuss_channel_member|是|否|自控制|否||
|[邮件 RTC 会话(DISCUSS_CHANNEL_RTC_SESSION)](module/discuss/discuss_channel_rtc_session)|discuss_channel_rtc_session|主实体|SQL|discuss_channel_rtc_session|否|否|自控制|否||
|[从 Tenor API 保存收藏的 GIF(DISCUSS_GIF_FAVORITE)](module/discuss/discuss_gif_favorite)|discuss_gif_favorite|主实体|SQL|discuss_gif_favorite|否|否|自控制|否||
|[语音附件的元数据(DISCUSS_VOICE_METADATA)](module/discuss/discuss_voice_metadata)|discuss_voice_metadata|主实体|SQL|discuss_voice_metadata|否|否|自控制|否||

