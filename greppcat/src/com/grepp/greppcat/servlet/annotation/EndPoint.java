package com.grepp.greppcat.servlet.annotation;

import com.grepp.greppcat.http.HttpMethod;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EndPoint {
    String url();
    HttpMethod method() default HttpMethod.GET;
}
