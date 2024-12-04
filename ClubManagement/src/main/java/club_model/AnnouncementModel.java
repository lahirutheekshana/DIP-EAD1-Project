package club_model;

public class AnnouncementModel {
    private String time = "" ;
    private int date = 0 ; 
    private String title = "" ;
    private String Description = "" ;
    private int memberID = 0 ;
    private int adminID = 1 ;
    private int staffID = 0 ;
    
    public AnnouncementModel () {
            String time = "" ;
            int date = 0 ; 
            String title = "" ;
            String Description = "" ;
            int memberID = 0 ;
            int adminID = 0 ;
            int staffID = 0 ;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }
    
    
}
