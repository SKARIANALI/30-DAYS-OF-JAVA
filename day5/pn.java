import java.util.Scanner;

class pn {
    public static void main(String[] args) {
        int n;
        Scanner ref=new Scanner (System.in);
        System.out.println("enter a number : ");
        n=ref.nextInt();

        if(n>=0){
            System.out.println("number is positive");
        }
        else{
            System.out.println("number is negative");
        }

    }
    
}
