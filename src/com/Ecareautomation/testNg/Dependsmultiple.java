package com.Ecareautomation.testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Dependsmultiple {
  @Test(dependsOnMethods="C")
  public void A() {
	  System.out.println("i am in A Test");
  }
  @Test(dependsOnMethods="D")
  public void B() {
	  System.out.println("i am in B Test");
  }
  @Test
  public void C() {
	  System.out.println("i am in C Test");
  }
  @Test(dependsOnMethods="A")
  public void D() {
	  System.out.println("i am in D Test");
  }
  @BeforeTest
  public void beforeTest() {
  }

 

}
