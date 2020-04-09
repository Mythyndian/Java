package com.maciej.zawistowski.testy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void shouldCountCorrectly() throws Exception {

        int actual = Fibonacci.fib(10);

        Assert.assertEquals(55,actual);


    }
}
