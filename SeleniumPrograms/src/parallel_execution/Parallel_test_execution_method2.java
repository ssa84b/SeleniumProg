package parallel_execution;

import org.testng.annotations.Test;

public class Parallel_test_execution_method2 {
  @Test
  public void testcase5() {
	  
	  long id=Thread.currentThread().getId();
	  System.out.println("Test case 5 is successful"+" Thread id: "+ id);
  }
  
  @Test
  public void testcase6() {
	  
	  long id =Thread.currentThread().getId();
	  System.out.println(" Test case 6 is successful" + " Thread id:"+ id);
  }
}
