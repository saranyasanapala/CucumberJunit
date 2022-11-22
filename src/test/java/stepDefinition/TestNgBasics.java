package stepDefinition;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	
		// TODO Auto-generated method stub
		@BeforeSuite 
		public void setup1(){
			System.out.println("Before Suite");
		}
		@BeforeTest
		public void BeforeTest(){
			System.out.println("Before Test");
		}
		@BeforeClass
		public void LaunchBrowser(){
			System.out.println("Before Class");
		}
		@BeforeMethod
		public void EnterURL(){
			System.out.println("Before method");
		}
		@Test
		public void Login(){
			System.out.println(" Test");
		}
		@Test
		public void Login1(){
			System.out.println(" Test1");
		}
		@Test
		public void Login2(){
			System.out.println(" Test2");
		}
		@AfterMethod
		public void LogOut(){
			System.out.println("After Method");
		}
		
		@AfterTest
		public void deleteAllcookies(){
			System.out.println("After Tets");
		}
		
		@AfterClass
		public void closeBrowser(){
			System.out.println("After claass");
		}
		@AfterSuite
		public void generateReport(){
			System.out.println("After suite");
		}

	}

	

