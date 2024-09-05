import java.util.Scanner;
import java.util.UUID;

public class employe extends showroom implements Utility {
    String emp_id;
    String emp_name;
    int emp_age;
    String showroom;
    String department;

    public void set_data(){
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id=String.valueOf(uuid);
        System.out.println("==============================***** ENTER EMPLOYEES DETAILS *****==============================");
        System.out.println();
        System.out.println(" ENTER EMPLOYEE NAME: ");
        emp_name = sc.nextLine();
        System.out.println("ENTER SHOWROOM NAME: ");
        showroom=sc.nextLine();
        System.out.println("ENTER DEPARTMENT NAME: ");
        department= sc.nextLine();
        System.out.println("ENTER AGE: ");
        emp_age = sc.nextInt();
    }

    public void get_data(){
        System.out.println("EMPLOYEE ID: "+ emp_id);
        System.out.println("NAME: "+ emp_name);
        System.out.println(" AGE: "+emp_age);
        System.out.println("SHOWROOM: "+showroom);
        System.out.println("DEPARTMENT: "+department);
    }
}
