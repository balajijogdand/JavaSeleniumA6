package org.automatioTestNGLearning;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void test() {
		Reporter.log("Test case 1 executed", true);
	}
	@Test
	public void m1() {
		Reporter.log("Test case 2 executed", true);
	}
	@Test
	public void mothod1() {
		Reporter.log("Test case 3 executed", true);
	}
}
