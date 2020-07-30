package org.andot.data.j2cube.annotation;

import java.lang.annotation.*;

/**
 * 对启动顺序进行排序
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Order {
    int value() default 0;
}
