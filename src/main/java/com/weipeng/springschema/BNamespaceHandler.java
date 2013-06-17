package com.weipeng.springschema;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class BNamespaceHandler extends NamespaceHandlerSupport {
	public void init() {
		registerBeanDefinitionParser("b", new BBeanDefinitionParser());
	}
}
