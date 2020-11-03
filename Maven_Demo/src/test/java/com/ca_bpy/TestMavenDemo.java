package com.ca_bpy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple MavenDemo.
 * " Hello MavenDemo~ "
 * In Unit test,the specified result is "Hello Maven~".
 * So check out the error.
 */
public class TestMavenDemo {
    @Test
    public void testMavenDemo() {
        MavenDemo mavenDemo = new MavenDemo();
        String res = mavenDemo.show("Hello MavenDemo~");

        Assert.assertEquals("Hello Maven~", res);
    }
}
