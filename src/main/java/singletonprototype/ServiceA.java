package singletonprototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") // Singleton scope
public class ServiceA {
    public void performTask() {
        System.out.println("ServiceA is performing its task."+this.hashCode());
    }
}