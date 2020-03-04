package test;

import static org.junit.Assert.*;

import code.Coding;

public class Test {

	@org.junit.Test
	public void test() {
	Coding c = new Coding();
	int out = c.SQR(3);
	assertEquals(9,out);
	}

}
