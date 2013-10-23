package com.mga.foobarqix.model;

import org.junit.Assert;
import org.junit.Test;

public class FooBarQixTest {
    private FooBarQix fooBarQix = new FooBarQix();
    
    @Test public void shoud_return_number() {
        Assert.assertEquals("1", fooBarQix.fooBarQix(1));
    }

    @Test public void should_return_foo() {
        Assert.assertEquals("FOOFOO",fooBarQix.fooBarQix(3));
        Assert.assertEquals("FOO",fooBarQix.fooBarQix(6));
        Assert.assertEquals("FOO",fooBarQix.fooBarQix((13)));
    }

    @Test public void should_return_bar() {
        Assert.assertEquals("BARBAR",fooBarQix.fooBarQix(5));
        Assert.assertEquals("BAR",fooBarQix.fooBarQix(10));
        Assert.assertEquals("BAR",fooBarQix.fooBarQix(52));
    }

    @Test public void should_return_qix() {
        Assert.assertEquals("QIXQIX",fooBarQix.fooBarQix(7));
    }
}
