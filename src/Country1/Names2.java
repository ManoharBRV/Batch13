package Country1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Names2 {
  @Test
  public void usa() {
	  
	  String n = "United States of America";
	  Assert.assertEquals("United States of America", n);
	  System.out.println("The Country Name correct as : " +n);
  }
  
  @Test
  public void rus() {
	  
	  String n = "Russia";
	  Assert.assertEquals("Russia", n);
	  System.out.println("The Country Name correct as : " +n);
  }
  
  @Test
  public void chi() {
	  
	  String n = "Cina";
	  Assert.assertEquals("China", n);
	  System.out.println("The Country Name correct as : " +n);
  }
  
 
  
}
