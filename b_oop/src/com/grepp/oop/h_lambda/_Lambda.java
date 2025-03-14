package com.grepp.oop.h_lambda;

import com.grepp.oop.h_lambda.function.Consumer;
import com.grepp.oop.h_lambda.function.Function;
import com.grepp.oop.h_lambda.function.Predicate;
import com.grepp.oop.h_lambda.function.Supplier;
import java.util.Random;

public class _Lambda {

    public void testConsumer(Consumer<String> c){
        String msg = "_Lambda.testConsumer";
        c.accept(msg);
    }

    public void testSupplier(Supplier<String> s){
        System.out.println("_Lambda.testSupplier : " + s.get());
    }

    public void testPredicate(Predicate<Integer> p){
        int num = new Random().nextInt(5);
        if (p.test(num)){
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
    }

    public void testFunction(Function<String, String> f){
        System.out.println(f.apply("_lambda", ".testFunction" ));
    }

}
