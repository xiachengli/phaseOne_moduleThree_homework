package com.lagou.edu.mvcframework.annotations;

import java.lang.annotation.*;

/**
 * 权限校验
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Security {
    String[] value();
}
