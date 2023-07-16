package com.pratiti.component;

import org.springframework.stereotype.Component;

@Component("compoName")			// no need to add Bean in XML
public class ClassWithAnnotation {
	public void fun() {
		System.out.println("Class who demonstrate working of Annotation");
	}
}
