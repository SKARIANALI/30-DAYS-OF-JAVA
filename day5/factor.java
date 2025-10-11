 
import java.util.Scanner;
class factor {
    public static void main(String[] args) {
        int n ;
        Scanner ref=new Scanner(System.in);
        System.out.println("enter a number : ");
        n=ref.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
            
        }
    }

}
