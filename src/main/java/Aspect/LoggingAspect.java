package Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {
// Question-4
//    @Before("execution(* *(..))")
//    public void beforeAdvice(){
//        System.out.println("Logging aspect");
//    }

    // Question-5
    @Around("execution(* *(..))")
    void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before method invokation logging");
        proceedingJoinPoint.proceed();
        System.out.println(proceedingJoinPoint.getSignature());
    }

    // Question-6
    @AfterThrowing(pointcut = "execution(* *(..))", throwing = "ex")
    void afterReturningAdvice(Exception ex) {
        System.out.println("Running AfterThrowing " + ex);
    }


    //Question-7
    //    @Before("execution(* *(..))")
//    public void beforeAdvice(){
//        System.out.println("Logging aspect");
//    }

    @Before("within(springclasses.*)")
    void beforeAdvice() {
        System.out.println("beforeAdvice within springclass package");
    }

    @Before("bean(database)")
    void beforeAdvice1() {
        System.out.println("beforeAdvice1 database bean");
    }

    @After("args(int)")
    void afterAdvice() {
        System.out.println("method with argument as int");
    }

    @Before("this(springclasses.Database)")
    void beforeAdvice3() {
        System.out.println("Running before advice");
    }

    //Question-8
    @After("displayPointcut()")
    void afterAdvice1(){
        System.out.println("Running after advice");
    }

    @Pointcut("execution(void display())")
    void displayPointcut(){
        System.out.println("using point-cut");
    }
    
}


