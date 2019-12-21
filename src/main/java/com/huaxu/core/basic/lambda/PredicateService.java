package com.huaxu.core.basic.lambda;

import com.huaxu.core.basic.lambda.model.PredicateModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/06 14:05
 */
public class PredicateService {

    private static Predicate<Integer> p1 = i-> i>5;
    private static Predicate<Integer> p2 = i-> i<20;
    private static Predicate<Integer> p3 = i-> i%2==0;

    public static List<Integer> init() {
        int[] numbers= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        List<Integer> list=new ArrayList<>();
        for(int i:numbers) {
            list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        // 过滤
        testPredicateTest();
        // 连接
        testPredicateAnd();
        // 针对某一个规则取反, 奇数偶数
        testPredicateNegate();
        // 直接比较
        testPredicateIsEqual();
    }

    private static void testPredicateIsEqual() {
        List<Integer> list = init();
        List<Integer> test = list.stream().filter(
                p1.and(p2).and(p3).and(Predicate.isEqual(8))
        ).collect(Collectors.toList());
        System.out.println(test.toString());
    }


    private static void testPredicateNegate() {
        List<Integer> list = init();
        List<Integer> test = list.stream().filter(
                p1.and(p2).and(p3.negate())
        ).collect(Collectors.toList());
        System.out.println(test.toString());
    }

    public static void testPredicateAnd() {
        List<Integer> list = init();
        List<Integer> test = list.stream().filter(
                p1.and(p2).and(p3)
        ).collect(Collectors.toList());
        System.out.println(test.toString());
    }


    public static void testPredicateTest() {
        PredicateModel model = new PredicateModel();

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));

        model.filter( list, (Integer value) -> value % 2 == 0 );
        list.forEach( (number)-> System.out.println(number));
    }
}