/**
 * Copyright (c) 2017, poet All Rights Reserved. 
 */
package poet.registry.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 服务注册与发现
 * 
 * @author <a href="mailto:frankzhiwen@163.com">郑智文(Frank Zheng)</a>
 * @version 0.0.1
 * @date 2017年4月23日
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
	}

}
