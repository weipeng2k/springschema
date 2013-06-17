package com.weipeng.springschema.impl;

import com.weipeng.springschema.A;
import com.weipeng.springschema.B;

public class AImpl implements A {

	private B b;

	@Override
	public void invoke(String a, String z) {
		String x = a + z;
		b.print(x);
	}

	public void setB(B b) {
		this.b = b;
	}

}
