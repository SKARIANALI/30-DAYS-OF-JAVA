import java.util.Scanner;
class arms{
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number:");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;
        int numberOfDigits = String.valueOf(num).length();

        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, numberOfDigits);  // for all
            // sum=(digit*digit*digit)+sum;   //for 3 digit number
            // sum=(digit*digit*digit*digit)+sum;  //for 4 digit number
            num /= 10;
        }

        if (originalNum == sum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
        
    }

}

       