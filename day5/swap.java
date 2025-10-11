// import java.util.Scanner;
// class swap{
//     public static void main(String[] args){
//         int a ,b,c;
//         System.out.println("enter two numbers for swap : ");
//         Scanner ref=new Scanner(System.in);
//         a=ref.nextInt();
//         b=ref.nextInt();
//         c=a;
//         a=b;
//         b=c;

//         System.out.println("After swap : " +a+" "+b);
//     }
// }






//without using third var


import java.util.Scanner;
class swap{
    public static void main(String[] args){
        int a ,b;
        System.out.println("enter two numbers for swap : ");
        Scanner ref=new Scanner(System.in);
        a=ref.nextInt();
        b=ref.nextInt();
        // a=a+b;
        // b=a-b;
        // a=a-b;

        a=a^b;
        b=a^b; //if both bits are same then true otherwise false
        a=a^b;

      System.out.println("After swap : " +a+" "+b);
    }
}