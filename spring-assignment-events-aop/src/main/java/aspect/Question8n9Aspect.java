package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Question8n9Aspect {

    //Question 8
    @Before("connectPointcut() || disconnectPointcut()")
    void beforeAdvice() {
        System.out.println("Q8 Running before advice using pointcut connect or disconnect");
    }

    @Before("connectPointcut()")
    void afterAdvice() {
        System.out.println("Q8 Running after advice using pointcut connect");
    }

    @Pointcut("execution(void connect())")
    void connectPointcut(){}

    @Pointcut("execution(void disconnect())")
    void disconnectPointcut(){}

    //Question 9
    @Before("bean(database1)")
    void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Running before advice");
        System.out.println("Signature : "+joinPoint.getSignature());
        System.out.println("Args : ");
        Object [] objects=joinPoint.getArgs();
        for (Object object:objects){
            System.out.println(object);
        }
    }

}
