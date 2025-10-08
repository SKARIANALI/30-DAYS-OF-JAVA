//print Multiplication Table
import java.util.Scanner;
class multabl{
    public static void main(String[] args) {
        int n;
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = ref.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n + " * " + i + " = " + n*i);
            
            
        }
    }

}