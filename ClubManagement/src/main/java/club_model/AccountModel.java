package club_model;

public class AccountModel {
             
         private int staffId;
         private String staffRole;
         private String staffFname;
         private String staffLname;
         private int age;
         private String StaffEmail;
         private String StaffPassword;
         private int adminId ;
         
         
         private int memberId;
         private String memberFname ;
         private String memberLname;
         private String memberEmail;
         private String memberPassword;
         private int memberAge;
         private String memberMobile;
         
         private String workingDate;
         private int workingHours;
         private double StaffSalary;
         private int StaffOT;
             
         public AccountModel () {
                  staffId = 0 ;
                  staffRole = "";
                  staffFname= "";
                  staffLname= "";
                  age = 0;
                  StaffEmail= "";
                  StaffPassword= "";
                  adminId = 1 ;
         
         
                  memberId= 0;
                  memberFname = "";
                  memberLname= "";
                  memberEmail= "";
                  memberPassword= "";
                  memberAge = 0;
                  memberMobile = "";
         
                  workingDate= "";
                  workingHours =0;
                  StaffSalary = 0.0;
                  StaffOT = 0;
         }        

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffRole() {
        return staffRole;
    }

    public void setStaffRole(String staffRole) {
        this.staffRole = staffRole;
    }

    public String getStaffFname() {
        return staffFname;
    }

    public void setStaffFname(String staffFname) {
        this.staffFname = staffFname;
    }

    public String getStaffLname() {
        return staffLname;
    }

    public void setStaffLname(String staffLname) {
        this.staffLname = staffLname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStaffEmail() {
        return StaffEmail;
    }

    public void setStaffEmail(String StaffEmail) {
        this.StaffEmail = StaffEmail;
    }

    public String getStaffPassword() {
        return StaffPassword;
    }

    public void setStaffPassword(String StaffPassword) {
        this.StaffPassword = StaffPassword;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberFname() {
        return memberFname;
    }

    public void setMemberFname(String memberFname) {
        this.memberFname = memberFname;
    }

    public String getMemberLname() {
        return memberLname;
    }

    public void setMemberLname(String memberLname) {
        this.memberLname = memberLname;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

    public String getMemberMobile() {
        return memberMobile;
    }

    public void setMemberMobile(String memberMobile) {
        this.memberMobile = memberMobile;
    }

    public String getWorkingDate() {
        return workingDate;
    }

    public void setWorkingDate(String workingDate) {
        this.workingDate = workingDate;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public double getStaffSalary() {
        return StaffSalary;
    }

    public void setStaffSalary(double StaffSalary) {
        this.StaffSalary = StaffSalary;
    }

    public int getStaffOT() {
        return StaffOT;
    }

    public void setStaffOT(int StaffOT) {
        this.StaffOT = StaffOT;
    }
                 
         
         
}
