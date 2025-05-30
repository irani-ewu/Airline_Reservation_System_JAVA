import java.util.*;
import java.io.*;
import static java.lang.System.exit;
public class LogIn 
{
    //The LogIn class demonstrates the user's step in to the system and further actions
    Scanner scan = new Scanner(System.in);
    File file = new File("Airline.txt") ;
    Scanner read = new Scanner(file);
    // This read object is used here to read from the Airline.txt file
    private String name;
    private String email;
    
    public LogIn() throws Exception // Chrcked Exception
    {
        System.out.println("Enter your name please: ");
        this.name=scan.nextLine();
        System.out.println("Enter your email please: ");
        this.email=scan.nextLine();
    }
    //ENCAPSULATION
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    
    public void Verify() // The most important method to compare the data of registration to login
    {
        String Name, Email;
        boolean logInSuccessful = false;
        while(read.hasNextLine())// This loop will check, is there more tokens to read till the end of the file
        {
        Name=read.nextLine();
        Email=read.nextLine();
        read.nextLine();
        
        if(name.equals(Name) && email.equals(Email))
        {
            System.out.println("Log in successful");
            logInSuccessful = true;
            
            while(true)
            {
            System.out.println("Flights for:\n 1. Domestic\n 2. International\n 3. Exit");
            
            int pick = scan.nextInt();
            scan.nextLine();
            
            switch(pick)
            {
                case 1 -> DomesticFlightBook();
                case 2 -> InternationalFlightBook();
                case 3 -> exit(0); 
            }
            }
        }
        }
        if(!logInSuccessful)
        {
            System.out.println("Invalid log in");
        }
       }
 
    
     public void DomesticFlightBook()
        {
           // This method is going to make a bridge between Domestic and LogIn class
            Domestic obj3 = new Domestic();
                    System.out.println("What do you want to do?\n"
                    + "1. Booking\n"
                    + "2. Seats Availability\n"
                    + "3. Choose A Seat to reserve\n");
            int choose = scan.nextInt();
            switch(choose)
            {
                case 1 -> obj3.Book();
                case 2 -> obj3.viewAllseats();
                case 3 -> obj3.chooseAseat();
            }

        }
        
     public  void InternationalFlightBook()
        {
            // This method is going to make a bridge between International and LogIn class
            International obj3 = new International();
            //Scanner scan = new Scanner(System.in);
                    System.out.println("What do you want to do?\n"
                    + "1. Booking\n"
                    + "2. Seats Availability\n"
                    + "3. Choose A Seat to reserve\n");
            int choose = scan.nextInt();
            switch(choose)
            {
                case 1 -> obj3.Book();
                case 2 -> obj3.viewAllseats();
                case 3 -> obj3.chooseAseat();
            }

        }

    // Switch-Case are used to take choice from the user
    public void closeReader()
    {
        read.close();
    }

}
