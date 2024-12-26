package jpaonetomanyinserts;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "project", schema = "sonar")


public class ProjectEntityOneToMany {
    public ProjectEntityOneToMany() {
        //Default constructor required bt jpa
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
    private List<EmployeeEntityOneToMany> employeeEntityList;

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

    public List<EmployeeEntityOneToMany> getEmployeeEntityList() {
        return employeeEntityList;
    }

    public void setEmployeeEntityList(List<EmployeeEntityOneToMany> employeeEntityList) {
        this.employeeEntityList = employeeEntityList;
    }
}
