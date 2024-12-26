package springdemo;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
    @Autowired
    PayService payService;

    public EmployeeService(){
        System.out.println(" from constructor  ===== ");
    }

    public void project(){
        System.out.println(" from project assignment");

        payService.pay();
    }
}