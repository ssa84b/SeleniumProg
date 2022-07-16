package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	
	
	  @Test
	  public void verifyTitle() {
		  Assert.assertEquals("Yahoo", "Yahoo");
	  }
	  @Test
	  public void abcd() {
		  Assert.assertEquals("Gmail", "Gmail");
	  }
	  
	  @Test
	  public void abc() {
	System.out.println("iam demo method");
	  }


}
