package com.github.codingdebugallday.mvcframework.annotations;

import java.lang.annotation.*;

/**
 * <p>
 * description
 * </p>
 *
 * @author isaac 2020/9/13 20:15
 * @since 1.0.0
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {

    String value() default "";
}
