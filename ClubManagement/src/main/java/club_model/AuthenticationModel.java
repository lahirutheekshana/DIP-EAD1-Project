
package club_model;


public class AuthenticationModel {
    private String fName = "";
    private String lName = "";
    private int age = 0;
    private String mobile = "";
    private String email = "";
    private String Password = "";
    private String role = "";
    private String staff_role = "";
    private double staff_basic = 0.00;
    private int admin_id = 1;
    
    public double getStaff_basic() {
        return staff_basic;
    }

    public void setStaff_basic(double staff_basic) {
        this.staff_basic = staff_basic;
    }
    
    public String getStaff_role() {
        return staff_role;
    }

    public void setStaff_role(String staff_role) {
        this.staff_role = staff_role;
    }
    
    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getFname() {
        return fName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setFname(String fName) {
        this.fName = fName;
    }

    public String getLname() {
        return lName;
    }

    public void setLname(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
