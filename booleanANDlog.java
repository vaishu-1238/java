
import java.util.*;
class booleanANDlog{
    public static void main(String[] args) {
                System.out.println("Enter the age:" );

        Scanner sc= new Scanner(System.in);
        int age=sc.nextInt();
       
        boolean license=true;
        if(age>18 && license){
            System.out.println("Eligible to drive");
        }
        else{
            System.out.println("Not eligible to drive");
        }
        sc.close();
    }
}