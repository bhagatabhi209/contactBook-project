import java.util.*;
import java.lang.*;


interface Utility {

    public void get_data();

    public void set_data();
}




public class main {

    static void main_menu(){
        System.out.println();
        System.out.println("==============================***** WELCOME TO SHOWROOM MANAGEMENT SYSTEM*****==============================");
        System.out.println();
        System.out.println("[1]. ADD SHOWROOM\t\t\t\t\t [2]. ADD EMPLOYEE \t\t\t\t\t [3]. ADD CAR " );
        System.out.println();
        System.out.println("[4]. GET SHOWROOM\t\t\t\t\t [5]. GET EMPLOYEE \t\t\t\t\t [6]. GET CAR " );
        System.out.println();
        System.out.println("========================================***** ENTER 0 FOR EXIT*****========================================");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        showroom show_room[] = new showroom[5];
        employe Employee[] =new employe[5];
        car Car[] = new car[5];
        int s_count=0;
        int e_count=0;
        int c_count=0;
        int choise=10;
        while (choise!=0){
            main_menu();
            choise=sc.nextInt();
            while(choise!=9 && choise!=0) {
                switch (choise) {
                    case 1:
                       show_room[s_count] = new showroom();
                        show_room[s_count].set_data();
                        s_count++;
                        System.out.println();
                        System.out.println("[1]. ADD SHOWROOM");
                        System.out.println("[9]. BACK TO THE MAIN MENU");
                        choise=sc.nextInt();
                        break;
                    case 2:
                        Employee[e_count]= new employe();
                        Employee[e_count].set_data();
                        e_count++;
                        System.out.println();
                        System.out.println("[2]. ADD EMPLOYEE");
                        System.out.println("[9]. BACK TO THE MAIN MENU");
                        choise=sc.nextInt();
                        break;
                    case 3:
                        Car[c_count]= new car();
                        Car[c_count].set_data();
                        c_count++;
                        System.out.println();
                        System.out.println("[3]. ADD CAR");
                        System.out.println("[9]. BACK TO THE MAIN MENU");
                        choise=sc.nextInt();
                        break;
                    case 4:
                        for (int i=0; i<s_count; i++){
                            show_room[i].get_data();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("[9]. BACK TO THE MAIN MENU");
                        System.out.println("[0]. EXIT");
                        choise=sc.nextInt();
                        break;
                    case 5:
                        for (int i=0; i<e_count; i++){
                            Employee[i].get_data();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("[9]. BACK TO THE MAIN MENU");
                        System.out.println("[0]. EXIT");
                        choise=sc.nextInt();
                        break;
                    case 6:
                        for (int i=0; i<c_count; i++){
                            Car[i].get_data();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("[9]. BACK TO THE MAIN MENU");
                        System.out.println("[0]. EXIT");
                        choise=sc.nextInt();
                        break;
                    default:
                        System.out.println(" enter valid number");
                        break;




                }
            }
        }



    }

    
}