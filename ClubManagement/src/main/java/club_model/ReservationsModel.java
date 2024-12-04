package club_model;

public class ReservationsModel {
     private String date ;
     private int Hours ;
     private String time;
     private String roomType;
     private String hallType;
     private double roomSize;
     private double hallSize;
     private int roomNum;
     private int hallNum;
    
    public ReservationsModel () {
        date = "";
        Hours  = 0;
        time = "";
        roomType = "";
        hallType = "";
        roomSize = 0.0;
        hallSize = 0.0;
        roomNum = 0;
        hallNum = 0;
    }

    public double getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(double roomSize) {
        this.roomSize = roomSize;
    }

    public double getHallSize() {
        return hallSize;
    }

    public void setHallSize(double hallSize) {
        this.hallSize = hallSize;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public int getHallNum() {
        return hallNum;
    }

    public void setHallNum(int hallNum) {
        this.hallNum = hallNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int Hours) {
        this.Hours = Hours;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getHallType() {
        return hallType;
    }

    public void setHallType(String hallType) {
        this.hallType = hallType;
    }
    
    
    
    
}
