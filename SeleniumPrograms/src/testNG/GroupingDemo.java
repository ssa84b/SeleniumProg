package testNG;

import org.testng.annotations.Test;

public class GroupingDemo {
  @Test(groups= {"sanity" ,"regression"},priority=1)
  public void login() {
	  System.out.println(" login successfully");
  }
  
  @Test(groups= {"sanity","regression"},priority=10)
  public void logout() {
	  System.out.println("logout successfully");
  }
  
  @Test(groups= {"sanity"},priority=4)
  public void search() {
	  System.out.println("seacrched successfully");
  }
  
  @Test(priority=2)
  public void addvendor() {
	  System.out.println("added vendor successfully");
  }
  
  @Test(groups= {"regression"},priority=3)
  public void advancesearch() {
	  System.out.println("advanced searched successfully");
  }
  
  @Test(groups= {"sanity","regression"},priority=5)
  public void prepaidrecharge() {
	  System.out.println("recharged successfully ");
  }
  
  @Test(groups= {"regression"},priority=6)
  public void billpayments() {
	  System.out.println("bills payed");
  }
}
