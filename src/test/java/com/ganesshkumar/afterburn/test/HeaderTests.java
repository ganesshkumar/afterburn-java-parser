package com.ganesshkumar.afterburn.test;

import com.ganesshkumar.afterburn.parser.Headers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeaderTests {
    @Test
    public void basic() {
        Headers headers = new Headers("GET localhost:8080\nContent-Length: 12\n");
        assertEquals(12, headers.contentLength());
        assertEquals("GET", headers.getMethod());
    }

    @Test(expected = RuntimeException.class)
    public void noContentLength() {
        Headers headers = new Headers("GET localhost:8080\n");
        headers.contentLength();
    }
}
