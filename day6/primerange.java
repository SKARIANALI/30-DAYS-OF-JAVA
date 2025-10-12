//print all prime numbers between two numbers
import java.util.Scanner;

class primerange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, i, j;

        System.out.println("Enter two numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        System.out.println("Prime numbers between " + n1 + " and " + n2 + " are:");

        for (i = n1; i <= n2; i++) {
            if (i < 2) // Skip numbers less than 2
                continue;

            for (j = 2; j <= i; j++) {  //least prime number is 2
                if (i % j == 0)
                    break;
            }

            if (i == j) // prime number found
                System.out.print(i + " ");
        
        }
    }
}

        

        
       