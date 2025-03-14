package com.grepp.oop.h_lambda.function;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);
}
