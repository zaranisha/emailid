package emailid;
import java.util.ArrayList;
import java.util.Scanner;


public class Searchemail {

    public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        

           emailID.add("ranveer@gmail.com");
           emailID.add("roronoazoro@gmail.com");
           emailID.add("nammi@gmail.com");
           emailID.add("buggy@gmail.com");
           emailID.add("luffy@gmail.com");
           emailID.add("kaiya@gmail.com");
           emailID.add("usoop@gmail.com");


        
     
         System.out.println("Enter the email to search");
         try (Scanner sc = new Scanner(System.in)) {
			String searchmail = sc.nextLine();
			  
			  if(emailID.contains(searchmail)){
				  System.out.println( "THIS EMAILID  "+searchmail + "  WAS FOUND IN THE LIST");
				    return;
				}
				else{
					 System.out.println( "THIS EMAILID  "+searchmail + "  WAS NOT FOUNT IN THE LIST");
				    return;
				}
		}
         }

    }

