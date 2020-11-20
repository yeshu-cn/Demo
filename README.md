# Demo

Model : 业务模型名称 


目标：
* Demo展示通用到业务场景
* 模版代码要求
    * 命名合理
    * 注释清晰
    * 必要的地方都有单元测试

通用的业务场景：
* 同步设备数据
* 同步云端数据
* 上传数据到云端
    * 后台线程中异步上传
    * 退出时同步上传
* 展示本地数据列表
* 展示本地数据详情


说明：不想生成太多到lib文件，所以最终data module的代码最终会移动到domain moduel中

todo:
1. 有人可以帮我一起完善注释说明(从相关书籍上找下框架角色的专业描述)
2. 完善Demo工程，让人一看demo工程就能了解自己的业务模块适不适合这个架构
3. 完善单元测试样例
4. 配套架构设计文档和UML图
5. 建个分支，将data module代码合并进入domain中