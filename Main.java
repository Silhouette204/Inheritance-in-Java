
package machineproblem6;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        Documents[] documents;
        Book[] book;
        EMail[] email;
 
        char addInfo;   
        do{
            
        int noAuthors; 
        System.out.println("How many Books and Authors you want to enter? ");
        noAuthors = input.nextInt();
        input.nextLine();
            
            documents = new Documents[noAuthors];
            book = new Book[noAuthors];
            email = new EMail[noAuthors];
            
            String name, date;
            
            for(int i = 0; i < noAuthors; i++){
                System.out.println("Enter name of the Author: " + (i + 1) + ":");
                name = input.next();
                
                System.out.println("Enter date for Author: " + (i + 1) + ":");
                date = input.next();
                
                documents[i] = new Documents(name, date);
                     
            }
            
            String title, subject, to;
            
             for (int i = 0; i < noAuthors; i++) {
                System.out.print("Enter title of book" + (i + 1) + ":");
                title = input.next();
                
                 System.out.println("Enter subject for the book " + (i + 1) + ":" );
                 subject = input.next();
                 
                 System.out.println("Enter attributed for a book " + (i + 1) + ":");
                 to = input.next();
                 
                 book[i] = new Book(documents[i].getAuthors(), documents[i].getDate(), title);
                 email[i] = new EMail(book[i].getAuthors(), book[i].getDate(), title, subject, to);
             }
             
                  System.out.print("Do you want to add more authors and books? (Y/N): ");
                  addInfo = input.next().charAt(0);
     
            } while (addInfo == 'Y' || addInfo == 'y');
            
            System.out.println("==========Lists of Books==========");
            for (int i = 0; i < documents.length; i++) {
                  System.out.println("Author " + (i + 1) + ":");
                   System.out.println("Name :" + documents[i].getAuthors());
                   System.out.println("Date : " + documents[i].getDate());
                   System.out.println("Title : " + book[i].getTitle());
                   System.out.println("Subject : " + email[i].getSubject());
                   System.out.println("To : " + email[i].getTo());
                   
            System.out.println("====================================");
            }
             
         input.close();
        
    }
}