package com.vit.demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAdd() {
        int result = App.add(2, 3);
        int expected = 6;
        assertEquals(expected, result);
        System.out.println("TEST PASSED: App.add(2, 3) returned " + result + ".");
    }
}
