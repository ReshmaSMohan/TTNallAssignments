package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Question7Aspect {

   /* @After("execution(void *())")
    void afterAdviceExcution(JoinPoint joinPoint) {
        System.out.println("After execution log :: " + joinPoint.getSignature());
    }*/

    /*@Before("within(classes.*)")
    void afterAdviceWithin(JoinPoint joinPoint) {
        System.out.println("Before within log :: " + joinPoint.getSignature());
    }*/

    /*@Before("bean(database1)")
    void afterAdviceBean(JoinPoint joinPoint) {
        System.out.println("Before Bean(database1) log :: " + joinPoint.getSignature());
    }*/

    /*@After("args(Integer)")
    void afterAdviceArgs(JoinPoint joinPoint) {
        System.out.println("After Args log :: " + joinPoint.getSignature());
    }
*/
    @After("this(classes.DatabaseQ7)")
    void afterAdviceArgs(JoinPoint joinPoint) {
        System.out.println("After this log :: " + joinPoint.getSignature());
    }

}
