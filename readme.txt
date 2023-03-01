api-passenger:用来接收前端发来的手机号，以及接受后面服务传来的验证码并将验证码存入redis服务
internal-common：用来全局定义一些返回类型
                CommonstatusEnum：定义了一个枚举类型：1 success 0 fail
                ResponseResult：使用链式调用和泛型来编写自定义的成功和失败返回类型
service-verificationcode： 根据apipassenger传来的手机号生成验证码并返回给qpipassenger