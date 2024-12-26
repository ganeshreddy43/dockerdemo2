package springbeanlifecycle;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @  Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public MyBean myBean(DependencyBean dependencyBean) {
        return new MyBean(dependencyBean);
    }

    @Bean
    public DependencyBean dependencyBean() {
        return new DependencyBean();
    }
}
