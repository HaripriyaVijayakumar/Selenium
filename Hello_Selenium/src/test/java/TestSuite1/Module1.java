package TestSuite1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Module1 {
	@BeforeSuite
	public void Beforesuite() {
		System.out.println("I am executing before every suite");
	}
	@BeforeTest
	public void Beforetest() {
		System.out.println("I am executing before every Test");
	}
	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println("I am executing before every class");
	}

	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("I am executing before every method");
	}

	@Test
	public void test001() {
		System.err.println("I am executing Test case 001");
		
	}
	@Test
	public void test002() {
		System.err.println("I am executing Test case 002");
		
	}
	@Test(groups = {"smoke","sanity"})
	public void test003() {
		System.err.println("I am executing Test case 003");
	}
	
	@AfterMethod
		public void AfterMethod() {
			System.out.println("I am executing after every method");
		}
	
	@DataProvider
	public Object[][] data001(){
		Object[][] data= {{"hari","pass001"},{"priya","pass002"}};
		return data;
	}
	@Test(dataProvider="data001")
	public void login(String username,String password)
	{
		System.out.println(username +"and"+ password);
	}
		
		@AfterClass
		public void AfterClass() {
			System.out.println("I am executing After every class");
		}
		@AfterTest
		public void Aftertest() {
			System.out.println("I am executing After every Test");
		}
		@AfterSuite
		public void Aftersuite() {
			System.out.println("I am executing After every suite");
		}
		
		
			}
	

	


