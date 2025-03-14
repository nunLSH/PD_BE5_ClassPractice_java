package com.grepp.oop.h_lambda.function;

@FunctionalInterface
public interface Function<T, R> {

    R apply(T arg, T arg2);

}
