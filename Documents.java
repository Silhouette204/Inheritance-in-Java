
package machineproblem6;
import java.util.Scanner;

public class Documents {
 
    private String authorNames, authorDates;
   
 
    public Documents(String authorNames, String authorDates ){
        this.authorNames = authorNames;
        this.authorDates = authorDates;
        
    }

    public String getAuthors(){
        return authorNames;
    }
    
    public String getDate(){
        return authorDates;
          
    }


         
}
