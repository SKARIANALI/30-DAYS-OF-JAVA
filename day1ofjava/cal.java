import java.util.Scanner;
class cal{

    public static void main(String[] args) {
        int a,b,ch;
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        
        System.out.println("Enter choice:");
        ch = sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Addition: " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication: " + (a * b));
                break;
            case 4:
                System.out.println("Division: " + (a / b));
                break;
            default:
                System.out.println("Invalid choice");
                


    }





}

}
   
