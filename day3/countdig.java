//count Digits in a Number
import  java.util.Scanner;  
class countdig{
    public static void main(String[] args) {
        int n,count=0;
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = ref.nextInt();
        if (n == 0) {
            count = 1;
        } else {
            while (n > 0) {
                n = n / 10;
                count++;
            }
        }
        System.out.println(count);
    

    }

}