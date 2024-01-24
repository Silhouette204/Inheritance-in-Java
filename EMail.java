
package machineproblem6;

public class EMail extends Documents {

    private String subject;
    private String to;
    
    public EMail(String authorNames, String authorDates, String title, String subject, String to) {
        super(authorNames, authorDates);
        
        this.subject = subject;
        this.to = to;
    }
        
    public String getSubject(){
        return subject;
    }
    
    public String getTo(){
        return to;
    }
    
    
}
