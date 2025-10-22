/* eslint-disable import/newline-after-import */
import { readFileSync, writeFileSync } from 'fs';
import { dirname, join } from 'path';
import { fileURLToPath } from 'url';
import { createRequire } from 'module';

// 获取当前模块的目录路径
const __dirname = dirname(fileURLToPath(import.meta.url));

// 创建 require 函数来读取 package.json
const require = createRequire(import.meta.url);

// 获取 package.json 中的版本号
const packageJson = require('../package.json');
const version = packageJson.version;

// 环境文件路径
const envFilePath = join(__dirname, '../public/environments/environment.js');

// 读取现有环境文件内容
let envFileContent;
try {
  envFileContent = readFileSync(envFilePath, 'utf8');
} catch (err) {
  console.error(`读取环境文件错误: ${err}`);
  process.exit(1);
}

// 判断文件类型并处理
let updatedContent;
if (envFileContent.includes('appVersion:')) {
  // 更新现有 appVersion
  updatedContent = envFileContent.replace(
    /appVersion:\s*['"][^'"]*['"]/,
    `appVersion: '${version}'`,
  );
} else {
  // 添加 appVersion 到全局对象
  updatedContent = envFileContent.replace(
    /window\.Environment = \{/,
    `window.Environment = {\n  appVersion: '${version}',`,
  );
}

// 写入更新后的内容
try {
  writeFileSync(envFilePath, updatedContent, 'utf8');
  console.log(`Successfully set appVersion to ${version}`);
} catch (err) {
  console.error(`写入环境文件错误: ${err}`);
  process.exit(1);
}
