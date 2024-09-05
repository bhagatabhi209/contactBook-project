import java.util.*;
import java.util.Scanner;

public class car extends showroom implements Utility{
     String car_name;
     String car_color;
     int car_price;
     String car_fuel_type;
     String car_type;

    public void set_data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================***** ENTER CARS DETAIL *****==============================");
        System.out.println();
        System.out.println(" ENTER CAR NAME: ");
        car_name = sc.nextLine();
        System.out.println("ENTER CAR COLOR: ");
        car_color = sc.nextLine();
        System.out.println("ENTER CAR PRICE: ");
        car_price=sc.nextInt();
        System.out.println("ENTER CAR FUEL TYPE: ");
        car_fuel_type= sc.nextLine();
        System.out.println("ENTER CAR TYPE: ");
        car_type= sc.nextLine();
        System.out.println("ENTER CAR PRICE: ");
        car_price=sc.nextInt();
        No_of_cars++;
    }

    public void get_data(){
        System.out.println("CAR NAME: "+ car_name);
        System.out.println("CAR COLOR: "+ car_color);
        System.out.println(" CAR PRICE: "+car_price);
        System.out.println("CAR FUEL TYPE: "+car_fuel_type);
        System.out.println("CAR TYPE: "+car_type);
    }

    
}
