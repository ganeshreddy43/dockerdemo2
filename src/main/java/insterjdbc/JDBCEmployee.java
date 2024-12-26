package insterjdbc;


import java.util.List;

public class JDBCEmployee {

        private String name;
        private int id;
        private String dept;
        private double salary;
        private int mid;
        private int pid;
        private List<JDBCEmployee> employeeList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public List<JDBCEmployee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<JDBCEmployee> employeeList) {
        this.employeeList = employeeList;
    }
}
