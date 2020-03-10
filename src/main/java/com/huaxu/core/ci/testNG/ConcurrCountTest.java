package com.huaxu.core.ci.testNG;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class ConcurrCountTest {

    private int initIncr;
    private int initVl;

    @BeforeClass
    void before() {
        initIncr = ConcurrCount.incr();
        initVl = ConcurrCount.incr();
    }

    @Test(threadPoolSize = 10, invocationCount = 100)
    void incr() {
        for (int i = 0; i < 20; i++) {
            ConcurrCount.incr();
        }
    }

    @Test(threadPoolSize = 10, invocationCount = 100)
    void decc() {
        for (int i = 0; i < 20; i++) {
            ConcurrCount.decc();
        }
    }

    @AfterClass
    void after() {
        assertEquals(initIncr + 2001, ConcurrCount.incr());
        assertFalse(initVl + 2001 != ConcurrCount.decc());
    }
}