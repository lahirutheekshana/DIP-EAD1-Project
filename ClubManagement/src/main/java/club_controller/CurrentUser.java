
package club_controller;

public class CurrentUser {
         private static String email = null ;  
         
         public CurrentUser (String email) {
             this.email = email ;
         }
    
         public static String get_Email () {                 
                    return email;         
         }
   
}
