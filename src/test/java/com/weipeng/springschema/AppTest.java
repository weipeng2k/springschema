package com.weipeng.springschema;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Unit test for simple App.
 */
@ContextConfiguration(locations = { "classpath:app.xml" })
public class AppTest extends AbstractJUnit4SpringContextTests {

	@Autowired
	private People cutesource;
	@Autowired
	@Qualifier("a")
	private A a;
	@Autowired
	private B b;
	@Autowired
	@Qualifier("x")
	private A x;

	@Test
	public void test() {
		System.out.println(cutesource);

		System.out.println(a);
		System.out.println(b);
		a.invoke("1", "2");
		x.invoke("a", "b");
	}

}
