package com.weipeng.springschema.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.weipeng.springschema.A;
import com.weipeng.springschema.B;

public class AImpl implements A, InitializingBean, ApplicationContextAware {

	private B b;

	private String prefix;

	private String suffix;
	
	@SuppressWarnings("unused")
	private ApplicationContext applicationContext;

	@Override
	public void invoke(String a, String z) {
		String x = a + z;
		b.print(prefix + x + suffix);
	}

	public void setB(B b) {
		this.b = b;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println(applicationContext);
		System.out.println("A set ApplicationContext.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("A Init.");
	}

}
