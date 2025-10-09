import java.util.Scanner;       
class salarytax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();
        double tax;

        if (salary>100000){
            tax = salary*0.2;
        }
        else if (salary>50000 && salary<=100000){
            tax = salary*0.1;
        }
        else{
            tax = 0;
        }
        System.out.println("Tax = "+ tax);
    }

}