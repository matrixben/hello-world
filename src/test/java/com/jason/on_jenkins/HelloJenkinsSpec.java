package com.jason.on_jenkins;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloJenkinsSpec {

    @Test
    public void whenCallPlayFunctionThenPrintHello(){
        HelloJenkins hello = new HelloJenkins();
        assertEquals("Hello jenkins.", hello.play());
    }
}
