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


feature:
* 分层结构的代码，各个角色职责明确：Model,Repository,Service,UseCase
* 数据bean归类：ModelBean,DaoBean,ApiBean,DeviceBean
* mock数据进行单元测试
* 编码时mock依赖数据
* domain中不使用koin, 只在ui层和宿主app中才使用
* 所有协程方法都是供主线程调用安全的


说明：完整的代码在simple分支中，因为不想生成太多到lib文件，所以把data module的代码移动到domain moduel中