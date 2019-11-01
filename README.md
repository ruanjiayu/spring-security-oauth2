# spring-security-oauth2
oAuth 协议为用户资源的授权提供了一个安全的、开放而又简易的标准。与以往的授权方式不同之处是 oAuth 的授权不会使第三方触及到用户的帐号信息（如用户名与密码），即第三方无需使用用户的用户名与密码就可以申请获得该用户资源的授权，因此 oAuth 是安全的。

获取code的URL:http://localhost:8080/oauth/authorize?client_id=client&response_type=code

获取access_token的URL:http://client:secret@localhost:8080/oauth/token <br>
其中client 是我们设置的认证服务器端的客户端 client_id <br>
secret 是我们设置的secret
