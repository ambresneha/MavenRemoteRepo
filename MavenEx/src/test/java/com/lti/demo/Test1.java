package com.lti.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test1 {
	@Test
  public  void Show() {        
        Welcome w= new Welcome();        
        assertEquals("Hello World - DevOps !!",w.show());
    
	}

}
