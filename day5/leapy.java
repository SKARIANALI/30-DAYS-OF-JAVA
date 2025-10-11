
 
import java.util.Scanner;
class leapy {
    public static void main(String[] args) {
        int year;
        Scanner ref=new Scanner(System.in);
        System.out.println("enter a year : ");
        year=ref.nextInt();

        if(year%4==0 && year%100!=0 || year%400==0 && year%100==0)  //logic
        {
            System.out.println("leap year");
        }
        else{
            System.out.println("not a leap year ");
        }
    }



    
}
