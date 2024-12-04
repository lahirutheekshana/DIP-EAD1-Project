
package club_model;

import java.sql.Date;
import java.sql.Time;

public class EventModel {
      private int eventId ;
      private String date;
      private String time ;
      private String eventType ;
      private final int adminId ;
      private String Des ;
      private String title ;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
      
      public EventModel () {
             eventId = 0;
             date = null;
             time = null;
             eventType = "";
             adminId = 0 ;
             Des = "";
             title = "";
      }

    public String getDes() {
        return Des;
    }

    public void setDes(String Des) {
        this.Des = Des;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String  getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String  time) {
        this.time = time;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
      
      
}
