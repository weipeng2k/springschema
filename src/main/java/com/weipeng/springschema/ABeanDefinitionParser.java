package com.weipeng.springschema;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import com.weipeng.springschema.impl.AImpl;

public class ABeanDefinitionParser implements BeanDefinitionParser {

	public BeanDefinition parse(Element arg0, ParserContext arg1) {
		RootBeanDefinition def = new RootBeanDefinition(); // 设置Bean Class
		def.setBeanClass(AImpl.class); // 注册ID属性
		def.setAutowireMode(RootBeanDefinition.AUTOWIRE_BY_NAME);
		String id = arg0.getAttribute("id");
		if (StringUtils.hasText(id)) {
			arg1.getRegistry().registerBeanDefinition(id, def);
		} else {
			arg1.getRegistry().registerBeanDefinition("a", def);
		}

//		def.getPropertyValues().addPropertyValue("b",
//				arg1.getRegistry().getBeanDefinition("b"));
		
		String prefix = arg0.getAttribute("prefix");
		def.getPropertyValues().addPropertyValue("prefix", prefix);
		
		String suffix = arg0.getAttribute("suffix");
		def.getPropertyValues().addPropertyValue("suffix", suffix);

		return def;
	}

}
