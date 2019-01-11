package janine.jaopanno;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 注解的切面类
 *
 * @author Janine
 */

@Aspect
public class JanineAspectAnno {

    // 切入点注解,等于给切入点取了别名，就是这个函数名了
    @Pointcut(value = "execution(* janine.jaopanno.JanineDao.save(..))")
    private void pointCut1(){}

    @Before(value = "JanineAspectAnno.pointCut1()")
    public void before() {
        System.out.println("前置切面");
    }



    // @AfterReturning 后置通知
    // 其他类似了
}
