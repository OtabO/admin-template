package zhangsx.authority;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import zhangsx.authority.Permission;
import zhangsx.bean.User;

import javax.servlet.http.HttpSession;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by zhangsx on 2016/12/23.
 */
public class SimpleInterceptor {
    public Object authentication(ProceedingJoinPoint pjp) {
        HttpSession httpSession=((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
        Object userInfoObj=httpSession.getAttribute("userInfo");
        if(userInfoObj==null){
            //跳转
        }
        User user=(User)userInfoObj;
        Signature signature = pjp.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method targetMethod = methodSignature.getMethod();

        Annotation[] annotations = targetMethod.getAnnotations();
        if (annotations != null) {
            for (int i = 0; i < annotations.length; i++) {
                if (annotations[i].annotationType().equals(Permission.class)) {
                    Permission p = (Permission) annotations[i];
                    if(user.getAuthority()!=p.code()){
                        //无权限
                    }
                }
            }
        }

        try {
            return pjp.proceed();
        } catch (Throwable throwable) {

        }

        return null;
    }
}
