import java.util.Scanner;
class div {
    public static void main(String[] args) {
        int n;
        Scanner ref=new Scanner(System.in);
        System.out.println("enter a number : ");
        n=ref.nextInt();

        if(n%5==0){
            System.out.println("number is divisible by 5 ");
        }
        else{
            System.out.println("number is not divisible by 5 ");
        }
    }

    
}
