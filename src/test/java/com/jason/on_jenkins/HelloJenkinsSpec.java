package com.jason.on_jenkins;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloJenkinsSpec {

    @Test
    public void whenCallPlayFunctionThenPrintHello(){
        HelloJenkins hello = new HelloJenkins();
        assertEquals("Hello jenkins.", hello.play());
    }

    @Test
    public void whenCallPlayWrongThenAssertWrong(){
        HelloJenkins hello2 = new HelloJenkins();
        assertEquals(false, hello2.playWrong());
    }
}
