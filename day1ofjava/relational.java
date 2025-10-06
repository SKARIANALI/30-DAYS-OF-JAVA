import java.util.Scanner;
public class relational {
    public static void main(String[] args) {
        int a ;
        int b ;
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("true/false " + (a == b)); ////(a == b) (boolean) gets converted into a string ("true" or "false").
        System.out.println("true/false " + (a != b));
        System.out.println("true/false " + (a > b));
        System.out.println("true/false " + (a < b));
        System.out.println("true/false " + (a >= b));
        System.out.println("true/false " + (a <= b));    
        
        
    }

}


//(a == b) (boolean) gets converted into a string ("true" or "false").
//the + operator is used for string concatenation if one side is a string.