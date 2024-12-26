package singletonprototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ServiceB {

    public void performTask() {
        System.out.println("ServiceB is performing its task."+this.hashCode());
    }
}
