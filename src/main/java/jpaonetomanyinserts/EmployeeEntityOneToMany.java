package jpaonetomanyinserts;

import jakarta.persistence.*;

@Entity
@Table(schema = "sonar",name = "employee_latest_jpa")


public class EmployeeEntityOneToMany {
    @Id
    @Column(name = "Id")
    private int empId;

    @Column(name = "name")
    private String empName;

    @Column(name = "salary")
    private String salary;

    @Column(name = "dept")
    private String dept;

    @Column(name = "state")
    private String state;


    @ManyToOne
    @JoinColumn(name = "pid", referencedColumnName = "id")
    private ProjectEntityOneToMany projectEntity;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ProjectEntityOneToMany getProjectEntity() {
        return projectEntity;
    }

    public void setProjectEntity(ProjectEntityOneToMany projectEntity) {
        this.projectEntity = projectEntity;
    }
}
