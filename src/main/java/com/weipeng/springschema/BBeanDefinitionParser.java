package com.weipeng.springschema;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

import com.weipeng.springschema.impl.BImpl;

public class BBeanDefinitionParser implements BeanDefinitionParser {

	public BeanDefinition parse(Element arg0, ParserContext arg1) {
		RootBeanDefinition def = new RootBeanDefinition(); // 设置Bean Class
		def.setBeanClass(BImpl.class); // 注册ID属性
		String id = arg0.getAttribute("id");
		BeanDefinitionHolder idHolder = new BeanDefinitionHolder(def, id);
		BeanDefinitionReaderUtils.registerBeanDefinition(idHolder,
				arg1.getRegistry());
		return def;
	}

}
