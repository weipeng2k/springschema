package com.weipeng.springschema.impl;

import com.weipeng.springschema.A;
import com.weipeng.springschema.B;

public class AImpl implements A {

	private B b;

	private String prefix;

	private String suffix;

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

}
