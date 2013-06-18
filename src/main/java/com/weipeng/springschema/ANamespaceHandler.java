package com.weipeng.springschema;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class ANamespaceHandler extends NamespaceHandlerSupport {  
    public void init() {  
        registerBeanDefinitionParser("a", new ABeanDefinitionParser());  
        registerBeanDefinitionParser("b", new BBeanDefinitionParser());  
    }  
}  
