package com.huaxu.core.jvm.initClass;

/**
 * <p>项目名称: putGet</p>
 * <p>文件名称: NotInitialization</p>
 * <p>文件描述: </p>
 * <p>内容摘要:简要描述本文件的内容，包括主要模块、函数及能的说明</p>
 * <p>其他说明:其它内容的说明</p>
 * <p>创建日期: 2019/04/28 10:49</p>
 * <p>创建用户：huaxu</p>
 */
public class NotInitialization {


    public static void main(String[] args) throws ClassNotFoundException {
//        demo1();
//        demo2();
//        demo3();
        demo4();
//        demo5();
//        demo6();
    }

    public static void demo1(){
        System.out.println(SubClass.a);
        new SubClass();
    }

    public static void demo2(){
        SubClass[] sub = new SubClass[10];
        System.out.println(sub[0]);
    }



    public static void demo5(){
        String s = Super.class.toString();
    }
    public static void demo6() {
        Super aSuper = null;
        try {
            aSuper = Super.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(aSuper);
    }



    public static void demo3(){
        System.out.println(SubClass.notFinalValue);
    }

    public static void demo4(){
        System.out.println(SubClass.finalString);
    }


    public static class Super {
        static {
            System.out.println("Super Class init -------");
        }
        public static int a = 123;
    }

    static class SubClass extends Super {
        static {
            System.out.println("SubClass class init ------");
        }
        public static final String finalString = "aaa";
        public static String notFinalValue = "hello world";
    }
}