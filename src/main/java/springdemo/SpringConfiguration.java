package springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan("com.neoteric.dec_dbconnection.springdemo")

public class SpringConfiguration {

    @Bean(name = "externalJavaService")
    public ExternalEmployeeService externalJavaService(){
        ExternalEmployeeService externalJavaService = new ExternalEmployeeService();
        return externalJavaService ;
    }

    @Bean
    public TCPConnection tcpConnectionService(){
        return new TCPConnection();
    }

    @Bean
    public ConnectionService mysqlConnectionService(TCPConnection tCPConnectionService){

        return new MysqlConnectionService(tCPConnectionService );
    }

    @Bean
    public ConnectionService oracleConnectionService(TCPConnection tCPConnectionService){

        return new OracleConnectionService(tCPConnectionService );
    }

}