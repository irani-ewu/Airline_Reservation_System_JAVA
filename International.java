import java.util.*;
import java.io.*;
public class International extends Reservation // Concept of INHERITANCE. International is the subclass of Reservation
{
    // To book international flight tickets
    private ArrayList<Boolean> seats;
    // Implementing the concept of COLLECTIONS . This ArrayList will store boolean datas. Note that Boolean is object type.
    
    // Initialize the seats list directly when declaring
    {
        seats = new ArrayList<>();
        for (int i = 0; i < 6; i++) 
        { // Fixed 6 seats
            seats.add(false); 
        }
    }
    // Overriding the abstract methods of Reservation class by giving body
    @Override
    public void chooseAseat()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the seat number please: ");
        int seatNum = input.nextInt();
        input.nextLine();
        
        if(!seats.get(seatNum-1))
        {
            seats.set(seatNum-1, true);
            System.out.println(seatNum+" no. seat is reserved for you.");
        }
        else
        {
            System.out.println("The "+seatNum+" no. seat is already reserved, sorry.");
        }
        
    }
    
    @Override
    public void viewAllseats()
    {
        for(int i=0 ; i<seats.size(); i++)
        {
            System.out.println("The seat no. "+(i+1)+": ");
            if(seats.get(i))
            {
                System.out.println("Reserved");
            }
            else
            {
                System.out.println("Available");
            }
        }
    }
    
         @Override
    public void Book() // The method to calculate payment transaction
    {
        int choice1, pay;
        int choice2;
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                                            1. Dhaka to Toronto (US-Bangla Airlines)
                                            BST 11:50 pm (Friday)\n
                                            1) Business Class: BDT 115000\n 
                                            2) Economy Class: BDT 79000\n
                                            2. Dhaka to Kualalampur (Biman Bangladesh Airlines)
                                            BST 9:30 pm (Saturday)\n
                                            1) Business Class: BDT 105000\n
                                            2) Economy Class: BDT 58500\n
                                            """);
        System.out.println("Choose your desired destination");
        choice1=scan.nextInt();
        switch(choice1)
        {
            case 1 -> {
                System.out.println("Choose seat type: ");
                choice2=scan.nextInt();
                switch (choice2) {
                    case 1 -> {
                        System.out.println("Pay BDT 115000");
                        pay=scan.nextInt();
                        if(pay<115000)
                        {
                            System.out.println("You need to pay "+(115000-pay)+" more to book.");
                        }
                        else
                        {
                            System.out.println("Transaction Successful.");
                        }
                    }
                    case 2 -> {
                        System.out.println("Pay BDT 79000");
                        pay=scan.nextInt();
                        if(pay<79000)
                        {
                            System.out.println("You need to pay "+(79000-pay)+" more to book.");
                        }
                        else
                        {
                            System.out.println("Transaction Successful.");
                        }
                    }
                    default -> System.out.println("Invalid Input");
                }
            }


        
            case 2 -> {
                System.out.println("Choose seat type: ");
                choice2=scan.nextInt();
                switch (choice2) {
                    case 1 -> {
                        System.out.println("Pay BDT 105000");
                        pay=scan.nextInt();
                        if(pay<105000)
                        {
                            System.out.println("You need to pay "+(105000-pay)+" more to book.");
                        }
                        else
                        {
                            System.out.println("Transaction Successful.");
                        }
                    }
                    case 2 -> {
                        System.out.println("Pay BDT 58500");
                        pay=scan.nextInt();
                        if(pay<58500)
                        {
                            System.out.println("You need to pay "+(58500-pay)+" more to book.");
                        }
                        else
                        {
                            System.out.println("Transaction Successful.");
                        }
                    }
                    default -> System.out.println("Invalid Input");
                }
            }


        }
        System.out.println("Please complete your seat choice through Reserve seat module.");
    }

}
