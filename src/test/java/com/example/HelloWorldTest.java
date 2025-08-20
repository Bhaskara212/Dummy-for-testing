package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void testGreetSuccess() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, World!", hw.greet());
    }

    @Test
    void testGreetFailure() {
        HelloWorld hw = new HelloWorld();
        // This will fail intentionally so you can see results in GitHub Actions
        assertEquals("Hi World", hw.greet());
    }
}