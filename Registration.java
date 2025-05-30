import java.util.*;
import java.io.*;
public class Registration 
{
    // This is the first of all classes. It has built to register a user details in file.
    Scanner scan = new Scanner(System.in);
    File file = new File("Airline.txt") ;
    // Creating a file named Airline.txt
    FileWriter append = new FileWriter(file,true);
    // FileWriter class's append object enables us to write multiple time in a certain file
    PrintWriter write = new PrintWriter(append);
    private String name;
    private String email;
    private int phone;
    
    public Registration() throws Exception
            //As we are dealing with file handling in this whole class, we are throwing CHECKED exception here
    {
        this.name=null;
        this.email=null;
        this.phone=0;
    }
    // Proper accessor and mutator are demonstrating below. We are showing here the concept named ENCAPSULATION
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public int getPhone()
    {
        return phone;
    }
    
    public void setName() 
    {
        System.out.println("Enter your Name please:");
        this.name=scan.nextLine();
        write.print(name+"\n");
    }
    public void setEmail()
    {
        System.out.println("Enter your Email please:");
        this.email=scan.nextLine();
        write.print(email+"\n");
    }
    public void setPhone()
    {
        System.out.println("Enter your Phone no. please:");
        this.phone=scan.nextInt();
        write.print(phone+"\n");
    }
    
    public void closeWriter()
    {
        write.flush();
        write.close();
    }
    // To close this file after writing
    
    
}
