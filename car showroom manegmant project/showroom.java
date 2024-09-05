import java.util.Scanner;
import java.util.*;

public class showroom implements Utility {
    String Showroom_name;
    String Address;
    int No_of_employees;
    int No_of_cars;

    public void set_data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================***** ENTER SHOWROOM DETAIL *****==============================");
        System.out.println();
        System.out.println(" ENTER SHOWROOM NAME: ");
        Showroom_name = sc.nextLine();
        System.out.println("ENTER ADDRESS: ");
        Address = sc.nextLine();
        System.out.println("ENTER NO. OF EMPLOYEES: ");
        No_of_employees=sc.nextInt();
        System.out.println("ENTER NO. OF CARS: ");
        No_of_cars= sc.nextInt();
    }

    public void get_data(){
        System.out.println("SHOWROOM NAME: "+ Showroom_name);
        System.out.println("ADDRESS: "+ Address);
        System.out.println(" NO. OF EMPLOYEES: "+No_of_employees);
        System.out.println("NO. OF CARS: "+No_of_cars);
    }
}
