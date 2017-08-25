package org.pentaho.wingman;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyClassTest {

  private MyClass myClass;

  @Before
  public void setUp() throws Exception {
    myClass = new MyClass();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testSayHello() {
    assertEquals("Hello!", myClass.sayHello());
  }

  @Test
  public void testHelloSir() {
    assertEquals("Hello Sir!", myClass.sayHello(Optional.of("Sir")));
  }

}
