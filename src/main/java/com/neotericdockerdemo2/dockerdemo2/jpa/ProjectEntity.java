package com.neotericdockerdemo2.dockerdemo2.jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Date;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(schema = "sonar", name = "project")
public class ProjectEntity {

    public ProjectEntity() {

    }

    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "pname")
    private String name;

    @Column(name = "startDate")
    private String startDate;

    @Column(name = "endDate")
    private String endDate;

    @OneToMany(mappedBy = "projectEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<EmployeeEntity> employeeEntityList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public List<EmployeeEntity> getEmployeeEntityList() {
        return employeeEntityList;
    }

    public void setEmployeeEntityList(List<EmployeeEntity> employeeEntityList) {
        this.employeeEntityList = employeeEntityList;
    }

    @Override
    public String toString() {
        return "ProjectEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +

                '}';
    }
}