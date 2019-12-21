package com.huaxu.core.basic.lambda;

import com.huaxu.core.basic.lambda.model.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/06 13:18
 */
public class Service {


    public static void main(String[] args) {
        print((a,b) -> a+b, 5, 6);
//       Service test1 = new Service();
//       test1.testLambda();
//       test1.testNormal();
    }


    private List<Apple> initList() {
        List<Apple> list = new ArrayList<>();
        list.add(new Apple("1", "red", "12", "aa"));
        list.add(new Apple("1", "green", "12", "aa"));
        return list;
    }

    private void testNormal() {
        List<Apple> list = initList();
        List<Apple> result = filterGreenApples(list, new AppleFilter() {
            @Override
            public boolean accept(Apple apple) {
                if ("red".equals(apple.getColor())) return true;
                return false;
            }
        });
        result.forEach((apple) -> System.out.println(apple));
    }


    private void testLambda() {
        List<Apple> list = initList();
        List<Apple> result = filterGreenApples(list, (Apple apple) -> "green".equals(apple.getColor()));
        result.forEach((apple) -> System.out.println(apple));
    }


    public static List<Apple> filterGreenApples(List<Apple> appleList, String appleColor) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleList) {
            if (appleColor.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterGreenApples(List<Apple> appleList, AppleFilter filter) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleList) {
            if (filter.accept(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void print(Core a, final int x, final int y){
        System.out.println(a.accept(x, y));
    }

}