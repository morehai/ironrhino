package org.ironrhino.core.metadata;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * properties are ignored in JsonUtils
 * 
 * @author zhouyanming
 * @see org.ironrhino.core.util.JsonUtils
 */
@Target({ METHOD, FIELD })
@Retention(RUNTIME)
public @interface NotInJson {
}
