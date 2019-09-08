import java.util.Scanner;

public class App1
{
    static Student std=new Student();
    static Book bk=new Book();
    static Scanner myObj = new Scanner(System.in); 

    public static void main(String[] args)
    {
       menu(); 
    }

    public static void menu()
    {
        String choice;
        do
        {
             // Create a Scanner object
            System.out.println("\nEnter choice");
            System.out.println("1. Create Student");
            System.out.println("2. Print Student");
            System.out.println("10. Exit");
            choice = myObj.nextLine(); 
            
            switch(choice)
            {
            case "1": 
                createstudent();
                break;
            case "2":
                printstudent();
                break;
            }
        }while(choice!="10");

    }

    private static void printbook() {
        bk.printbook();
    }
    
    private static void printstudent() {
        std.printstud();
    }
    
    private static void createbook() {
        
        System.out.println("Enter id");
        int t= Integer.parseInt(myObj.nextLine());
        bk.setid(t);
    
        System.out.println("Enter Name");
        bk.setname(myObj.nextLine()); 
    
        System.out.println("Enter Author");
        bk.setauthor(myObj.nextLine()); 
    
    }
    
    private static void createstudent() {
    
        System.out.println("Enter id");
        int r= Integer.parseInt(myObj.nextLine());
        std.setid(r);
    
        System.out.println("Enter Name");
        std.setname(myObj.nextLine());
    }

  
}



