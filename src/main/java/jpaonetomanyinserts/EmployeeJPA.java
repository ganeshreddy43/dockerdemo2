package jpaonetomanyinserts;

import java.util.ArrayList;
import java.util.List;

public class EmployeeJPA {
    private int id;
    private int pid;
    private String name;
    private String dept;
    private double salary;
    private String state;
    private int mid;
    private EmployeeJPA manager;
    private List<EmployeeJPA> employeeList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public EmployeeJPA getManager() {
        return manager;
    }

    public void setManager(EmployeeJPA manager) {
        this.manager = manager;
    }

    public List<EmployeeJPA> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<EmployeeJPA> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "EmployeeJPA{" +
                "id=" + id +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", state='" + state + '\'' +
                ", mid=" + mid +
                ", manager=" + manager +
                ", employeeList=" + employeeList +
                '}';
    }
}
