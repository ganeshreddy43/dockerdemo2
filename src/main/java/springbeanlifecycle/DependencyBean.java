package springbeanlifecycle;
import org.springframework.stereotype.Component;
public class DependencyBean {
    public void execute() {
        System.out.println("DependencyBean: Executing a dependent task.");
    }
}
