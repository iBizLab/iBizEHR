<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def _default = logic.param("default").getReal();
def _list = new ArrayList();
def _map = new HashMap();

_map.put("stage_id","1");
_map.put("start_time","2");
_map.put("duration","2");

_list.add(_map);
_default.set("interviews",_list);
_default.set("email_content","<p><strong>尊敬的</strong> 张三 <strong>先生/女士:</strong></p><p> &nbsp; &nbsp; &nbsp;您好! &nbsp;我司诚邀您参加 HRBP 的面试。烦请您在面试前，完成线上应聘信息表及大五性格测评，我司将做好信息保密工作。具体面试安排如下：</p><p> &nbsp; &nbsp; &nbsp;面试时间：2025年8月15日星期五 16:00</p><p> &nbsp; &nbsp; &nbsp;面试地点: 面试安排成功后会显示具体信息</p><p> &nbsp; &nbsp; &nbsp;联系人: &nbsp;梁进</p><p> &nbsp; &nbsp; &nbsp;联系电话： 0521-3769521</p>");
_default.set("sms_content","尊敬的 张三 先生/女士:\n      您好!  我司诚邀您参加 HRBP 的面试。烦请您在面试前，完成线上应聘信息表及大五性格测评，我司将做好信息保密工作。具体面试安排如下：\n      面试时间：2025年8月15日星期五 16:00\n      面试地点: 面试安排成功后会显示具体信息\n      联系人:  梁进\n      联系电话： 0521-3769521");

```
