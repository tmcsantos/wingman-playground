/*The MIT License

Copyright (c) 2017-2018 tsantos

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/


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

  @Test
  public void testHelloSir2() {
    assertEquals("Hello Sir2!", myClass.sayHello(Optional.of("Sir2")));
  }

}
