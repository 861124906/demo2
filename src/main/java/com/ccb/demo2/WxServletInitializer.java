package com.ccb.demo2;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 实现外部 Web 容器启动的启动类 
 * 这个类的作用与在web.xml中配置负责初始化Spring应用上下文的监听器作用类似，
 * 只不过在这里不需要编写额外的XML文件了。而这个类的位置和要Application.java在同一个目录下。
 * @author lvyuefei.co
 *
 */
public class WxServletInitializer extends SpringBootServletInitializer{
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(App.class);//App 为原main函数启动类
    }
}
