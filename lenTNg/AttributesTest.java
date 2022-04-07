package lenTNg;

import org.testng.annotations.Test;

public class AttributesTest {

	//Execution order with same annotation - based on ascii value of MethodName
	//priority=orderOfExecutionWithSameAnnotations(default=0)ranges(..-2000to2000)
	
	//invocationCount = execution of test case multiple times(default=1)
	
	//enabled = skip one test case from execution(default =true)
	
	@Test(priority=1)
	public void test1(){
		System.out.println("Test1-priority1");
	}
	@Test(priority=3)
	public void test2() {
		System.out.println("Test2-priority3");
	}
	@Test(priority=2, invocationCount=4)
	public void test3() {
		System.out.println("Test3-priority2");
		
	}
	@Test(priority=4, enabled = false)
	public void test4() {
		System.out.println("Test4-priority4");
	}
}
	
	/*
	 * Test1-priority1 
	 * Test3-priority2 
	 * Test3-priority2 
	 * Test3-priority2
	 * Test3-priority2 
	 * Test2-priority3
	 */
	
