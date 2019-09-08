
import java.util.Scanner;

public class App
{
    static Car bcCar=new Car();
    static SUVCar nS = new SUVCar("Mahindra");
    static SUVCar nSss = new SUVCar(99,"SUx","Mahindra");
    
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
            System.out.println("1. Create Car");
            System.out.println("2. Print Car");
            System.out.println("3. Create SUV Car");
            System.out.println("4. Print SUV Car");
            System.out.println("10. Exit");
            choice = myObj.nextLine(); 
            
            switch(choice)
            {
            case "1": 
                createCar();
                break;
            case "2":
                printCar();
                break;
            case "3":
                createSUVCar();
                break;
            case "4":
                printSUVCar();
                break;
            }
        }while(choice!="10");

    }

    private static void printSUVCar() {
        nSss.printCar();
    }

    private static void createCar() {
        System.out.println("Enter price");
        int t= Integer.parseInt(myObj.nextLine());
        bcCar.setPrice(t);
        
        System.out.println("Enter type");
        bcCar.setType(myObj.nextLine());


    }

    private static void printCar() {
        bcCar.printCar();
    }

    private static void createSUVCar()
    {
        nS.setPrice(100);
        nS.setType("SUV");
        nS.setManufacturer("Mahindra");
    }

  
}