package club_model;


public class SalaryModel {
    private String w_date = "" ;
    private int w_hours = 0 ;
    private double salary = 0.00 ;
    private String ot = "" ;
    private String adminID = "" ;
    private int StaffID = 0 ;
    private String date = "" ;

    public SalaryModel() {
           w_date = "" ;
           w_hours = 0 ;
           salary = 0.00 ;
           ot = "" ;
           adminID = "" ;
           StaffID = 0 ;
           date = "" ;
    }

    public String getW_date() {
        return w_date;
    }

    public void setW_date(String w_date) {
        this.w_date = w_date;
    }

    public int getW_hours() {
        return w_hours;
    }

    public void setW_hours(int w_hours) {
        this.w_hours = w_hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public int getStaffID() {
        return StaffID;
    }

    public void setStaffID(int StaffID) {
        this.StaffID = StaffID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
