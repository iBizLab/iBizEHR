<p class="panel-title"><b>执行代码</b></p>

```javascript
// 计算新建默认值
const _viewparam = uiLogic.view.params;
console.log("");
const mimeTypeMap = {
  ".txt": "text/plain",
  ".html": "text/html",
  ".htm": "text/html",
  ".css": "text/css",
  ".js": "application/javascript",
  ".json": "application/json",
  ".xml": "application/xml",
  ".csv": "text/csv",
  ".jpg": "image/jpeg",
  ".jpeg": "image/jpeg",
  ".png": "image/png",
  ".gif": "image/gif",
  ".bmp": "image/bmp",
  ".svg": "image/svg+xml",
  ".webp": "image/webp",
  ".ico": "image/x-icon",
  ".mp4": "video/mp4",
  ".webm": "video/webm",
  ".ogg": "video/ogg",
  ".mp3": "audio/mpeg",
  ".wav": "audio/wav",
  ".flac": "audio/flac",
  ".aac": "audio/aac",
  ".pdf": "application/pdf",
  ".doc": "application/msword",
  ".docx": "application/vnd.openxmlformats-officedocument.wordprocessingml.document",
  ".xls": "application/vnd.ms-excel",
  ".xlsx": "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
  ".ppt": "application/vnd.ms-powerpoint",
  ".pptx": "application/vnd.openxmlformats-officedocument.presentationml.presentation",
  ".zip": "application/zip",
  ".rar": "application/x-rar-compressed",
  ".7z": "application/x-7z-compressed",
  ".tar": "application/x-tar",
  ".gz": "application/gzip",
  ".exe": "application/octet-stream",
  ".woff": "font/woff",
  ".woff2": "font/woff2",
  ".ttf": "font/ttf",
  ".otf": "font/opentype"
};
uiLogic.attach = uiLogic.files.map(item => 
    {
        const defaultMimeType = "application/octet-stream";
        var _mimeType = defaultMimeType;
        const match = item.filename.match(/\.([^.]+)$/);
        if (match){
            const ext = match[0].toLowerCase();
            _mimeType = mimeTypeMap[ext] || defaultMimeType;
        }
    
        return {
            name: item.name,
            file_id: item.id,
            id: item.uuid,
            res_id: _viewparam.mail_thread,
            res_model: _viewparam.srfmodelname,
            type: "binary",
            store_fname: item.filename,
            file_size: item.filesize,
            mimeType: _mimeType,
        }
    }
)

```
