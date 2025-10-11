import java.util.Scanner;

class sumofdig {
    public static void main(String[] args) {
        int n;
        Scanner ref=new Scanner(System.in);
        System.out.println("enter a number : ");
        n=ref.nextInt();
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("sum of digits : "+sum); 
        
    }
}
