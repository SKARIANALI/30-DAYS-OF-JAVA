import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        int age ; 
        System.out.println("Enter age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt(); //METHOD MUST BE DECLARE
        

        // Check if the person is an adult
        if (age >= 18) {
            System.out.println("The person is an adult.");
        } else {
            System.out.println("The person is a minor.");
        }

        // Check age categories
    //     if (age < 13) {
    //         System.out.println("The person is a child.");
    //     } else if (age >= 13 && age < 18) {
    //         System.out.println("The person is a teenager.");
    //     } else if (age >= 18 && age < 65) {
    //         System.out.println("The person is an adult.");
    //     } else {
    //         System.out.println("The person is a senior citizen.");
    //     }
     }

}
