package com.mga.foobarqix.model;

import org.fest.assertions.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class FooBarQixTest {
    private FooBarQix fooBarQix = new FooBarQix();
    
    @Test public void shoud_return_number() {
        Assertions.assertThat(fooBarQix.fooBarQix(1)).isEqualTo("1");
    }

    @Test public void should_return_foo() {
        Assertions.assertThat(fooBarQix.fooBarQix(3)).isEqualTo("FOOFOO");
        Assertions.assertThat(fooBarQix.fooBarQix(6)).isEqualTo("FOO");
        Assertions.assertThat(fooBarQix.fooBarQix(13)).isEqualTo("FOO");
    }

    @Test public void should_return_bar() {
        Assertions.assertThat(fooBarQix.fooBarQix(5)).isEqualTo("BARBAR");
        Assertions.assertThat(fooBarQix.fooBarQix(10)).isEqualTo("BAR");
        Assertions.assertThat(fooBarQix.fooBarQix(52)).isEqualTo("BAR");
        Assert.assertEquals("BAR",fooBarQix.fooBarQix(52));
    }

    @Test public void should_return_qix() {
        Assertions.assertThat(fooBarQix.fooBarQix(7)).isEqualTo("QIXQIX");
        Assertions.assertThat(fooBarQix.fooBarQix(14)).isEqualTo("QIX");
        Assertions.assertThat(fooBarQix.fooBarQix(17)).isEqualTo("QIX");
    }

    @Test public void should_return_foobarqix() {
        Assertions.assertThat(fooBarQix.fooBarQix(35)).isEqualTo("BARQIXFOOBAR");
    }
}
