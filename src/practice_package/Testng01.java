package practice_package;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng01 {
	@Test(priority = 1)
	public void awhi() {
		System.out.println("it is a main test method");
	}

	@BeforeMethod 
	public void f2() {
		System.out.println("it is before method");
		
	}
	
	@AfterMethod 
	public void f3() {
		System.out.println("it is after method");
		
	}
	@Test(priority = 2)
	public void arun() {
		System.out.println("it is a second test method");
	}
	@BeforeClass
	public void shebber() {
		System.out.println("before class annotation");
		
	}
	@AfterClass
	public void balu() {
		System.out.println("after class annotation");
		
	}
	@Test(priority = 3)
	public void keerthi() {
		System.out.println("it is a keerthi test method");
	}
	@BeforeTest
	public void before_test() {
		System.out.println("it is a before test method");
	}
	@AfterTest
	public void after_test() {
		System.out.println("it is a after test method");
	}
	
}
