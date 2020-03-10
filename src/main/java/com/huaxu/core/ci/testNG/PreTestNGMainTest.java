package com.huaxu.core.ci.testNG;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;


@Test
public class PreTestNGMainTest {

    @BeforeClass
    void sayBefore() {
        System.out.println("我是前置类");
    }

    @AfterClass
    void sayAfter() {
        System.out.println("我是后置类");
    }

    @BeforeMethod
    void goBefore() {
        System.out.println("我是前置方法");
    }

    @AfterMethod
    void goAfer() {
        System.out.println("我是后置方法");
    }


    @Test(invocationCount = 4, threadPoolSize = 2)
    void add() {
        System.out.println("add Thread Id : " + Thread.currentThread().getId());
        PreTestNGMain preTestNGMain = new PreTestNGMain();
        assertEquals(preTestNGMain.add(5, 3), 8);
    }

    @Test
    void dev() {
        System.out.println("dev Thread Id : " + Thread.currentThread().getId());
        PreTestNGMain preTestNGMain = new PreTestNGMain();
        assertEquals(preTestNGMain.dev(5, 3), 2);
    }

    @Test(timeOut = 1, enabled = false)
    public void testTime() {
        System.out.println("123");
        int i = 0;
        while (i < 1000000) {
            i++;
        }
    }

    @Test(expectedExceptions = NullPointerException.class)
    public void testSub() {
        System.out.println("456");
        throw new NullPointerException();
    }

    @Test(dependsOnMethods = {"testTime", "testSub"})
    public void testMethond() {
        System.out.println(0);
    }

    @DataProvider(name = "user")
    public Object[][] getStr() {
        return new Object[][]{
                {"", "", "账号不能为空"},
                {"admin", " ", "密码不能为空"},
                {" ", "a123456", "账号不能为空"},
                {"ad ", "123456", "账号“ad”不存在"},
                {"admin", "12345", "密码错误"},
        };
    }

    @Test(dataProvider = "user")
    void sout(String uname, String pword, String msg) {
        System.out.println(uname + "->" + pword + "->" + msg);

    }
}