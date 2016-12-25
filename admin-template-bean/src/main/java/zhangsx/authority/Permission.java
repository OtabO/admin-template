package zhangsx.authority;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Created by zhangsx on 2016/12/23.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value={ METHOD })
public @interface Permission {
    int code() ;
}
