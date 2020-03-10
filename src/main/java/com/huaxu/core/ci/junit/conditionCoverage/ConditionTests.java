package com.huaxu.core.ci.junit.conditionCoverage;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * <p>项目名称: demo</p>
 * <p>文件名称: ConditionTests</p>
 * <p>创建日期: 2019/06/05 15:44</p>
 * <p>创建用户：huaxu</p>
 */
public class ConditionTests {

    @BeforeEach
    @DisplayName("前置测试")
    public void before(){
        System.out.println("此类中每个方法调用之前使用-注意是每次");
    }

    @AfterEach
    @DisplayName("后置测试")
    public void after(){
        System.out.println("此类中每个方法调用之后使用-注意是每次");
    }

    @BeforeAll
    @DisplayName("前置测试-全局")
    public static void beforeAll(){
        System.out.println("此类中每个方法调用之前使用-注意是只一次-最开始使用-staticProxy");
    }

    @AfterAll
    @DisplayName("后置测试-全局")
    public static void afterAll(){
        System.out.println("此类中每个方法调用之后使用-注意是只一次-最开始使用-staticProxy");
    }


    @Test
    @DisplayName("简单测试")
    public void testCoverageSampleMethodsFalse(){
        CoverageSampleMethods methods = new CoverageSampleMethods();
        Assert.assertFalse(methods.testMethod(0, 0, 0));
    }

    @ParameterizedTest
    @DisplayName("参数化测试")
    @CsvSource({
        "0,1,3",
        "1,2,2"
    })
    public void testABC(int a, int b, int c){
        CoverageSampleMethods methods = new CoverageSampleMethods();
        Assert.assertTrue(methods.testMethod(a, b, c));
    }

    @ParameterizedTest
    @DisplayName("ints测试")
    @ValueSource(ints = {1,2,3,4,5,6})
    public void testABC(int a){
        Assert.assertTrue(5 == a);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1","2","3","a","b",""})
    public void testABC(String a){
        Assert.assertTrue( "a".equals(a));
    }


    @RepeatedTest(7)
    @DisplayName("重复测试")
    public void testCoverageSampleMethods(){
        CoverageSampleMethods methods = new CoverageSampleMethods();
        Assert.assertFalse(methods.testMethod(4, 2, 5));
    }


    class CoverageSampleMethods {
        public Boolean testMethod(int a, int b, int c) {
            boolean result = false;
            if (a == 1 && b == 2 || c==3)
                result = true;
            return result;
        }
    }
}
