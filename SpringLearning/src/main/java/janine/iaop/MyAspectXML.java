package janine.iaop;

// 经典aspect，不要用昂
// import org.aopalliance.intercept.Joinpoint;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXML {

    // 前置通知
    public void checkPri(JoinPoint joinPoint) {
        System.out.println("权限校验");
        System.out.println(joinPoint);
    }

    // 后置通知
    public void writeLog(Object 随便写) {
        System.out.println(随便写);
    }

    // 环绕通知
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        Object object = null;
        // 方法的执行
        int flag = 1;
        if (flag == 1) {
            // 执行目标程序
            object = proceedingJoinPoint.proceed();
        }

        System.out.println("环绕后");
        return object;
    }

    public void afterThrowing(Throwable ex) {
        // 可以获取异常信息
        System.out.println("异常抛出通知" + ex.getMessage());
    }

    // 最终通知，一定执行
    public void after() {
        System.out.println("end~~~");
    }
}
