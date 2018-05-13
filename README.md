# DataStone项目简介 #	
## 前言 ##
为符合正常的软件开发流程，符合项目开发逻辑的编码顺序，该简介在初期保证项目可coding的条件下，逐步添加SpringCloud相关的组件和模块功能，重点侧重于功能点的实现以及整体项目的高可用性、扩展性等。
**截至目前，项目中包含的模块有：**

| 序号   |      服务名称      |  服务端口 |功能|
|----------|:-------------:|------:|------:|
| 1  |  datastone-eureka-server | 8110 |服务注册与发现|
| 2  |  datastone-mysql-client  | 8120 |Mysql数据抽取 |




## datastone-eureka-server ##
相关配置 :

**application.yml**
> 	server:
> 	  port: 8100
> 	eureka:
> 	  instance:
> 		hostname: localhost
> 	  client:
> 		register-with-eureka: false
> 		fetch-registry: false
> 			service-url:
> 	  default-zone: http://${eureka.instance.hostname}:${server.port}/eureka/
> 

相关代码 ：
EurekaServerApplication.java

	@EnableEurekaServer
	@SpringBootApplication
	public class EurekaServerApplication {
	    public static void main(String [] args){
	        SpringApplication.run(EurekaServerApplication.class,args);
	    }
	}







