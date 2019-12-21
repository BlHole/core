package com.huaxu.core.junit.assertTest;

import org.junit.Assert;
import org.junit.Test;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: AssertTest</p>
 * <p>文件描述: </p>
 * <p>内容摘要: 简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明: 其它内容的说明</p>
 * <p>创建日期: 2019/06/06 18:39</p>
 * <p>创建用户：huaxu</p>
 */
public class AssertTest {

    @Test
    public void accessTrueTest(){
        Assert.assertTrue(true);
    }

    @Test
    public void accessFalseTest(){
        Assert.assertFalse(false);
    }

    @Test
    public void acccessEqulasTest(){
        Assert.assertEquals("a", "a");
    }

    @Test
    public void acccessNotEqulasTest(){
        Assert.assertNotEquals("a", "b");
    }

    @Test
    public void acccessNullTest(){
        Assert.assertNull(null);
    }

    @Test
    public void acccessNotNullTest(){
        Assert.assertNotNull(new Object());
    }

    @Test
    public void acccessSameTest(){
        Object b = new Object();
        Assert.assertSame(b, b);
    }

    @Test
    public void acccessNotSameTest(){
        Object b = new Object();
        Assert.assertNotSame(b, new Object());
    }

    @Test
    public void acccessArrayEquelsTest(){
        int[] a=  new int[]{1,2,3,4};
        int[] b = a;
        Assert.assertArrayEquals(a, b);
    }
}