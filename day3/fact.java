import java.util.Scanner;
class fact {
    public static void main(String[] args) {
        int n, fact=1;
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = ref.nextInt();
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }

    
}
