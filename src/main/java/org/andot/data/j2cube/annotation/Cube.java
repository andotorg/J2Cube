package org.andot.data.j2cube.annotation;

import java.lang.annotation.*;

/**
 * 表名他是一个cube类
 * 此注解只是用来做标识
 * @author lucas
 * @date 2020-7-30 15:50:35
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface Cube {
}
