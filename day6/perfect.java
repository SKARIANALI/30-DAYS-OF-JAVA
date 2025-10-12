import java.util.Scanner;

 class perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a perfect number:");
        int num = sc.nextInt();
        int sum = 0; 
        if(num==1){
            System.out.println(num + " is not a perfect number.");
            return;
        }

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
            if(num==sum)
            {
                System.out.println(num + " is a perfect number.");
            }
            else
            {
                System.out.println(num + " is not a perfect number.");
            }
        }
            
    }
           
    

