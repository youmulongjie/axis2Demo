说明：

1) services.xml 的路径：在WEB-INF 下新建/services/axis(这个名字可以随便取)/META-INF/services.xml 

2) services.xml 配置可参考：https://blog.csdn.net/zjw10wei321/article/details/7708117

3) 发布后服务访问路径：http://localhost:8080/axis2Demo/services/siHay?wsdl
	其中 services 是过滤器在web.xml里设置，名字不能修改；
	sayHi 是服务名称，在services.xml 里设置
	wsdl是默认的后缀