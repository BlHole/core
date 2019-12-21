package com.huaxu.core.basic.lambda.model;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @program putGet
 * @description:
 * @author: huaxu
 * @create: 2019/04/06 13:59
 */
public class PredicateModel {

    public <T> void filter(List<T> numbers, Predicate<T> predicate) {
        Iterator<T> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (!predicate.test(iterator.next())) {
                iterator.remove();
            }
        }
    }
}