
package machineproblem6;


public class Book extends Documents{
    
 private String title;
 
    public Book(String authorNames, String authorDates, String title) {
        super(authorNames, authorDates);   
        
      this.title = title;
      
    }
    
    public String getTitle(){
        return title;
    }
    
}
