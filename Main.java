import java.util.*;
import java.io.*;
import static java.lang.System.exit;
public class Main 
{
    public static void main(String[] args) 
    {
        int choose;
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.println("Welcome to the Airline Reservation System\n"
                + "Choose any of the following options: \n"
                + "1. Registration\n"
                + "2. Log In\n"
                + "3. For details\n"
                + "4. Exit\n");
        choose = scan.nextInt();
        scan.nextLine();
        
        try // Here is the UNCHECKED Exception 
        {
            switch(choose)
                {
                    case 1 -> RegisterUser();
                    case 2 -> LoginUser();
                    case 3 -> viewDetails();
                    case 4 -> exit(0);
                    default -> 
                            {
                                System.out.println("Invalid input");
                            }
                }
        }
        
         catch(InputMismatchException e) //Catch for grabbing the thrown error
            {
                System.out.println("Give int value. This is the exception.");
            }
        
    }
    
  }
        
        // Here we have distributed these methods to invoke all classes's  important methods
        public static void RegisterUser()
        {
            try // This try-catch block is for the previous CHECKED exception thrown in Registration class
                 {
                    Registration obj = new Registration();
                    obj.setName();
                    obj.setEmail();
                    obj.setPhone();
                    obj.closeWriter();
                 }
            catch(Exception e)
                {
                    System.out.println("Handle File_Exception please"+e);
                }
        }
        
        public static void LoginUser()
        {
          try// This try-catch block is for the previous CHECKED exception thrown in LogIn class
            {
             LogIn obj1 = new LogIn();
             obj1.Verify();
             obj1.closeReader();
            }
          catch(Exception e)
            {
             System.out.println("Handle File_Exception please"+e);
            }
        }
        
        public static void viewDetails()
        {
            int choose;
            Scanner scan = new Scanner(System.in);
            Details obj2 = new Details();
               System.out.println("Which type of details you want to know?\n"
                    + "1.  Flights\n"
                    + "2.  Take off\n"
                    + "3.  Tickets\n"
                    + "4.  Discounts\n");
            choose = scan.nextInt();
            switch(choose)
            {
                case 1 -> obj2.detailsOfFlights();
                case 2 -> obj2.detailsOfTakeoff();
                case 3 -> obj2.detailsOfTickets();
                case 4 -> obj2.detailsOfDiscount();
            }
        }
        
        
}