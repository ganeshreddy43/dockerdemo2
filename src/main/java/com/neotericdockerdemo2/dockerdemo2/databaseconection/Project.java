package com.neotericdockerdemo2.dockerdemo2.databaseconection;


import java.sql.Date;
import java.util.List;

public class Project {
    private String pname;
    private Date startDate;
    private Date endDate;
    private int id;
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Project(String pname, Date startDate, Date endDate, int id, List<Employee> employeeList) {
        this.pname = pname;
        this.startDate = startDate;
        this.endDate = endDate;
        this.id = id;
        this.employeeList = employeeList;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
