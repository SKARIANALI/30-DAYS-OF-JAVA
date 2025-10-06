import java.util.Scanner;

class nestedif {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number:");
        Scanner ref = new Scanner(System.in);
        num = ref.nextInt();

        if (num >= 0) {
            System.out.println("The number is positive.");
    
            if (num % 2 == 0) {
                System.out.println("The number is even.");
            } 
        
            else {
                System.out.println("The number is odd.");
            }
        } 
        else {
            System.out.println("The number is negative.");
        }
    
    

  } 

}