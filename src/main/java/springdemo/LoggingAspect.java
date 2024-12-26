package springdemo;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component

public class LoggingAspect {
    @Around("")
    public void logging(){
        long startTimeInmills = System.currentTimeMillis();
        System.out.println("Entry into {methodname} method");

        long endTimeInmills = System.currentTimeMillis();
        System.out.println("Exit from  {methodname} method timeTaken");

    }
}
