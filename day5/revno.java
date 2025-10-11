 import java.util.Scanner;
 class revno {

    public static void main(String[] args) {
        int n, rem, rev = 0; //n=123
        Scanner ref = new Scanner(System.in);
        System.out.println("enter a number : ");
        n = ref.nextInt();

        while (n > 0) {
            rem = n % 10; //gives the last digit of the number.
            //rem =123%10=3
            //rem=12%10=2
            //rem=1%10=1

            rev = rev * 10 + rem; //appends that digit to the reversed number.
            //rev=0*10+3=3
            //rev=3*10+2=32

            n = n / 10; //removes the last digit from the original number.
            //n=123/10=12
            //n=12/10=1
            
        }
        System.out.println("reverse number : " + rev);
    }

    
}






