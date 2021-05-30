package com.dp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
    private Fibonacci fibonacci;
    @Before
    public void before(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void run(){
        Assert.assertEquals(fibonacci.calculate(-1).toString(), "0");
        Assert.assertEquals(fibonacci.calculate(0).toString(), "1");
        Assert.assertEquals(fibonacci.calculate(1).toString(), "1");
        Assert.assertEquals(fibonacci.calculate(2).toString(), "2");
        Assert.assertEquals(fibonacci.calculate(3).toString(), "3");
        Assert.assertEquals(fibonacci.calculate(4).toString(), "5");
        Assert.assertEquals(fibonacci.calculate(5).toString(), "8");
    }
}
