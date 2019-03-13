package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

@Aspect
public class LoggingAspect {

//    Question 4 and 5

    @Before("within(classes.DatabaseQ4n5)")
    void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Before log " + joinPoint.getSignature());
    }

    @After("within(classes.DatabaseQ4n5)")
    void afterAdvice(JoinPoint joinPoint) {
        System.out.println("After log " + joinPoint.getSignature());
    }

    /*@Around("within(classes.DatabaseQ4n5)")
    void aroungAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Date start = Calendar.getInstance().getTime();
        System.out.println("Around Before log "+proceedingJoinPoint.getSignature());
        proceedingJoinPoint.proceed();
        Date end = Calendar.getInstance().getTime();
        Integer time = end.getSeconds()-start.getSeconds();
        System.out.println("Around After log : time taken :: "+time+" : by method : "+proceedingJoinPoint.getSignature());
    }*/

    // Question 6
    @AfterThrowing(pointcut = "execution(* *(..))", throwing = "ex")
    void afterReturningAdvice(JoinPoint joinPoint, IOException ex) {
        System.out.println("Running AfterThrowing :: " + ex + " :: " + joinPoint.getSignature());
    }


}
