package singletonprototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration
@ComponentScan(basePackages = "com.neotericdockerdemo2.dockerdemo2.singletonprototype")
public class AppConfig {
    @Bean
    @Scope("singleton") // Explicit singleton scope declaration
    public ServiceA serviceA() {
        return new ServiceA();
    }

    @Bean
    @Scope("prototype") // Explicit prototype scope declaration
    public ServiceB serviceB() {
        return new ServiceB();
    }
}