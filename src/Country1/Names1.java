package Country1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Names1 {
  @Test
  public void ind() {
	  
	  String n = "India";
	  Assert.assertEquals("India", n);
	  System.out.println("The Country Name correct as : " +n);
  }
  
  @Test
  public void uk() {
	  
	  String n = "United King";
	  Assert.assertEquals("United Kingdom", n);
	  System.out.println("The Country Name correct as : " +n);
  }
  
  @Test
  public void pak() {
	  
	  String n = "Pakistan";
	  Assert.assertEquals("Pakistan", n);
	  System.out.println("The Country Name correct as : " +n);
  }
  
  @Test
  public void sco() {
	  
	  String n = "Scotland";
	  Assert.assertEquals("Scotland", n);
	  System.out.println("The Country Name correct as : " +n);
  }
  
  @Test
  public void aus() {
	  
	  String n = "Australia";
	  Assert.assertEquals("Australia", n);
	  System.out.println("The Country Name correct as : " +n);
  }
  
}
