package insterjdbc;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JDBCProject {
    private String pname;
    private Date startDate;
    private Date endDate;
    private int id;
    private List<JDBCEmployee> employeeList = new ArrayList<>();

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
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

    public List<JDBCEmployee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<JDBCEmployee> employeeList) {
        this.employeeList = employeeList;
    }

}
