package testNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	@BeforeTest
	public void Bmethod() {
		System.out.println("iam before test ");
	}
	
	@AfterTest
	public void Amethod()
	{
		System.out.println("iam after Test");
	}
	
	
	@Test
  public void login() {
	  
	  System.out.println("Login successfully");
  }
  @Test()
  public void logout() {
	   System.out.println("logout successfully");
  }
  
  @Test(dependsOnMethods= {"advancedsearch"})
  public void search()
  {
	  System.out.println("Search successfully");
  }
  @Test
  public void advancedsearch(){
	  Assert.assertEquals("Gmail", "Gmail");
	  
  } 
  
}
