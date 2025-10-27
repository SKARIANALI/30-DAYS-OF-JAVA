                                            // Throw keyword //
// class thr {
//     public static void main(String[] args) {
//         System.out.println("Program starts");   
//             int age = 17;
//             if (age < 18) 
//             {
//                 throw new ArithmeticException ("You are not eligible to vote.");
//             } 
//             else 
//             {
//                 System.out.println("You are eligible to vote.");
//             }
//         System.out.println("Program ends");
//     }

    
// }






// class thr {
//     public static void main(String[] args) {
//         System.out.println("Program starts");   
//         throw new ArithmeticException ("exception");
//     }

    
// }




// class thr {

//     void divide(int a , int b)
//     {
//         if (b==0)
//         {
//             throw new ArithmeticException(" \n Do not divide by zero");
//         }
//         else 
//         {
//             int c = a/b;
//             System.out.println(c);
//         }
//     }
//     public static void main(String[] args) {
//        thr ref=new thr();
//        ref.divide(10,0);  // error shows 
//     }
// }

//                                                  // Best Approach //

// class thr {

//     void divide(int a , int b) throws ArithmeticException
//     {
//         if (b==0)
//         {
//             throw new ArithmeticException(" \n Do not divide by zero");
//         }
//         else 
//         {
//             int c = a/b;
//             System.out.println(c);
//         }
//     }
//     public static void main(String[] args) {
//        thr ref=new thr();
//        try
//        {
//        ref.divide(10,0);  

//        }
//        catch (ArithmeticException e)
//        {
//         System.out.println("The valur of b is zero : "+e);
//        }
//     }
// }

