package com.itheima.config;

import org.springframework.context.EnvironmentAware;
import org.springframework.stereotype.Component;


/**
 * @author xuelin
 */
@Component
public class TestBean {

		public void print(){
			System.err.println("testBean method..."); System.err.println("spring源码环境构建完成...");
		}

}
