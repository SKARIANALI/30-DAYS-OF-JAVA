
//calculate power of a Number


// import java.util.Scanner;
// class power {
    
//     public static void main(String[] args) {
//         int p,n,result=1;
//         // double p,n,result=1;
//         Scanner ref = new Scanner(System.in);
//         System.out.println("Enter the number:");
//         n = ref.nextInt();
//         System.out.println("Enter the power:");
//         p = ref.nextInt();
//         // result = Math.pow(n,p);   //using pow function 
//         result =(int) Math.pow(n,p); //using pow function 

//         System.out.println(result);

// //Math.pow() always returns a double value (a decimal type).
// //Math.pow(2, 3) returns 8.0
// //(int)Math.pow(2, 3) converts it to 8
    
// }

// }






import java.util.Scanner;
class power {
    
    public static void main(String[] args) {
        int p,n,result=1;
        // double p,n,result=1;
        Scanner ref = new Scanner(System.in);
        System.out.println("Enter the number:");
        n = ref.nextInt();
        System.out.println("Enter the power:");
        p = ref.nextInt();
        // result = Math.pow(n,p);   //using pow function 
        // result =(int) Math.pow(n,p); //using pow function 
        for(int i=1;i<=p;i++){
            result = result*n;
        }

        System.out.println(result);


    }
}