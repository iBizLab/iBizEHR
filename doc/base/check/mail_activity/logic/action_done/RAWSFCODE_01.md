<p class="panel-title"><b>执行代码[Groovy]</b></p>

```groovy
def defaultObj = logic.param('default').getReal();
def mailMessageObj  = logic.param('mail_message').getReal();

def activityTypeName=defaultObj.get('activity_type_name');
def activityTypeId=defaultObj.get('activity_type_id');
def userName=defaultObj.get('user_name');
def userId=defaultObj.get('user_id');
def srfuserid=defaultObj.get('srfuserid');
def summary=defaultObj.get('summary');
def note=defaultObj.get('note');

//反馈内容
def feedBack=defaultObj.get('feedback');
//当前登录用户id
def srfPartnerId=defaultObj.get('srfpartnerid');

// def mailActivityMxin=defaultObj.get('mail_activity_mixin');
// def srfModelName=defaultObj.get('srfmodelname');
def mailActivityMxin=defaultObj.get('mail_activity_mixin')?: defaultObj.get("res_id");
def srfModelName=defaultObj.get('srfmodelname')?: defaultObj.get("res_model");


def displayAssignee = (userId != srfuserid);

def body = activityTypeName + '\t 完成' + 
    (displayAssignee ? '（最初分配给 ' + userName + '）' : '') +
    (summary ? ':' + summary : '');

def notePart = note ? '\t\n原始备注:\n' + note: '';
notePart = notePart?.replaceAll(/<\/?p>/, '') ?: ''
def feedbackPart = feedBack ? '\t\n反馈:\n' + feedBack : '';

body += notePart + feedbackPart;    

mailMessageObj.set('body',body);
mailMessageObj.set('author_id',srfPartnerId);
mailMessageObj.set('mail_activity_type_id',activityTypeId);
mailMessageObj.set('res_id',mailActivityMxin);
mailMessageObj.set('model',srfModelName);

  
 println("mailMessageObj"+mailMessageObj);





```
