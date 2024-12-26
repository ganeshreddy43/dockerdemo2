package jpaonetomanyinserts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectJPA { private int id;
    private String pname;
    private Date Startdate;
    private Date enddate;
    private List<EmployeeJPA> empAllocation = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Date getStartdate() {
        return Startdate;
    }

    public void setStartdate(Date startdate) {
        Startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public List<EmployeeJPA> getEmpAllocation() {
        return empAllocation;
    }

    public void setEmpAllocation(List<EmployeeJPA> empAllocation) {
        this.empAllocation = empAllocation;
    }

    @Override
    public String toString() {
        return "ProjectJPA{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", Startdate=" + Startdate +
                ", enddate=" + enddate +
                ", empAllocation=" + empAllocation +
                '}';
    }
}
