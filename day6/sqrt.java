import java.util.Scanner;
class sqrt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num,num1;
        num = sc.nextInt();
        num1=Math.sqrt(num);

        System.out.println("Square root of " + num + " is " + num1);
        
    }

}