package com.huaxu.core.diy;

/**
 * <p>project: core</p>
 * <p>description: </p>
 * <p>create: 2019/10/08 10:02</p>
 * <p>author：huaxu</p>
 */
public class DoubleTest {

    public static void main(String[] args) {
        System.out.println(0.0f == 0);
        System.out.println(0/0.0);
        System.out.println(Double.longBitsToDouble(0x7ff0000000000001L));
        System.out.println(Double.longBitsToDouble(0x7ff0000000000001L-0xfff));
        System.out.println(Double.NaN == Double.NaN);
        System.out.println(0x7ff8000000000000L == Double.doubleToLongBits(Double.NaN));

//        System.out.println(Double.doubleToLongBits(Double.NEGATIVE_INFINITY));
//        System.out.println(Double.doubleToRawLongBits(Double.NEGATIVE_INFINITY));
//        System.out.println(1.0/0);
////        System.out.println(0/0);
//        System.out.println(0.0/0.0);
//        System.out.println(0.0/0);
//        Double a = new Double(1.1);
//
//        System.out.println(Float.POSITIVE_INFINITY == (Float.POSITIVE_INFINITY + 10000)); // output: true
//        System.out.println(Float.POSITIVE_INFINITY == (Float.POSITIVE_INFINITY - 10000)); // output: true
//        System.out.println(Float.POSITIVE_INFINITY == (Float.POSITIVE_INFINITY * 10000)); // output: true
//        System.out.println(Float.POSITIVE_INFINITY == (Float.POSITIVE_INFINITY / 10000)); // output: true
//
//        System.out.println(Double.isInfinite(Float.POSITIVE_INFINITY)); // output: true
//
//        System.out.println(Float.NaN == Float.NaN); // output: false 自己都不等于自己是什么鬼
//        System.out.println(Double.isNaN(Float.NaN)); // output: true
//
//
//        double i = 1.0e50;
//        System.out.println(i);
//        System.out.println(i == i + 1);// true
    }
}