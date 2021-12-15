package com.itheima.test;

import com.itheima.config.TestBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {

	/* 	   问题1：如何创建的BeanFactory(真实类型是什么)？
		   问题2：如何解析的配置文件，封装的BeanDefation

		   ---
		   问题3：验证IOC流程
		   问题4：Bean的生命周期
		   问题5：什么是循环依赖？怎么解决循环依赖【面试题】

		 */
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

		TestBean testBean = (TestBean) applicationContext.getBean("testBean");
		testBean.print();
		applicationContext.close();
	}

}
