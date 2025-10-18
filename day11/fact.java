import java.util.Scanner;
class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        fact obj = new fact();   //obj creation 
        int result = obj.factorial(num);
        System.out.println("Factorial of the number is: " + result);
    }

    int factorial(int num) {
        if (num == 0) {
            return 1;
        } 
        else 
        {
            return num * factorial(num - 1);
        }
    }

    
}
