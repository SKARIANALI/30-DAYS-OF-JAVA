// import java.util.Scanner;
// class evenoddsum{
//     public static void main(String[] args) {    
//         int n,i,sum=0;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         n = sc.nextInt();

//     if(n%2==0){
//         System.out.println("The number is even");
//         for(i=0;i<=n;i+=2){
//             sum=sum+i;
           
//         }
//         System.out.println("= " + sum);

//     }
//     else{
//         System.out.println("The number is odd");

//         for(i=1;i<=n;i+=2){  
//             sum=sum+i;
        
//         }
//         System.out.println("sum is : " + sum);
//     }
    

            
// }

// }



import java.util.Scanner;
class evenoddsum{
    public static void main(String[] args) {    
        int n, i, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("The number is even");
            System.out.print("Series: ");
            for (i = 0; i <= n; i += 2) {
                sum = sum + i;
                if (i + 2 <= n)  // to avoid extra '+'
                    System.out.print(i + " + ");
                else
                    System.out.print(i);
            }
            System.out.println(" = " + sum);
        } else {
            System.out.println("The number is odd");
            System.out.print("Series: ");
            for (i = 1; i <= n; i += 2) {
                sum = sum + i;
                if (i + 2 <= n)
                    System.out.print(i + " + ");
                else
                    System.out.print(i);
            }
            System.out.println(" = " + sum);
        }
    }
}


