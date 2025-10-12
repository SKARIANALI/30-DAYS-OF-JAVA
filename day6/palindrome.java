 import java.util.Scanner;

 class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome:");
        int num = sc.nextInt();
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;   //reverse a number
            num /= 10;
        }

        if (originalNum == reversedNum) { // 121=121 ? true ---> palindrome
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
       
    }

    
}
