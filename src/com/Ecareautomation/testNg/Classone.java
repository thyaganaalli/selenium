package com.Ecareautomation.testNg;

import org.testng.annotations.Test;

public class Classone extends com.Ecareautomation.testNg.BaseClassone{
  @Test(priority=2)
  public void f() {
	  System.out.println("i am in f classone");
  }
  @Test(priority=3)
  public void A() {
	  System.out.println("i am in   A classone");
  }
  @Test(priority=1)
  public void B() {
	  System.out.println("i am in  B classone");
  }
}
