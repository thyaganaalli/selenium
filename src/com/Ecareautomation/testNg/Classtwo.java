package com.Ecareautomation.testNg;

import org.testng.annotations.Test;

public class Classtwo extends com.Ecareautomation.testNg.BaseClassone{
  @Test(priority=2)
  public void X() {
	  System.out.println("i am in  x second class");
  }
  @Test(priority=1)
  public void Y() {
	  System.out.println("i am in  Y  second class");
  }
  @Test(priority=3)
  public void Z() {
	  System.out.println("i am in  Z second class");
  }
}
