                                         // try-catch-finally //


// class tcf {
//     public static void main(String[] args) {
//         try 
//         {
//         System.out.println("Program starts");
//         int a = 10;
//         int b = 0;
//         int c = a / b;
//         System.out.println(c);
//         System.out.println("exception");

//         } 
//         catch (ArithmeticException e) 
//         {
//             System.out.println("Cannot divide by zero: " + e);
//         } 
//         finally 
//         {
//             System.out.println("Finally block executed");
//         }
//         System.out.println("Program ends");
//     }

    
// }






// class tcf {
//     public static void main(String[] args) {
//         try 
//         {
//         System.out.println("Program starts");
//         int a = 10;
//         int b = 2;
//         int c = a / b;
//         System.out.println(c);
//         System.out.println("exception not occured ");

//         } 
//         catch (ArithmeticException e) 
//         {
//             System.out.println("Cannot divide by zero: " + e);
//         } 
//         finally 
//         {
//             System.out.println("Finally block executed");
//         }
//         System.out.println("Program ends");
//     }

    
// }




                                   // Abnormal termination //

// class tcf {
//     public static void main(String[] args) {
//         try 
//         {
//         System.out.println("Program starts");
//         int a = 10;
//         int b = 0;
//         int c = a / b;
//         System.out.println(c);
//         System.out.println("exception");

//         } 
//         catch (NullPointerException e) // exception mistmatch //
//         {
//             System.out.println("Cannot divide by zero: " + e);
//         } 
//         finally 
//         {
//             System.out.println("Finally block executed");
//         }
//         System.out.println("Program ends");
//     }

    
// }


                        // catch block exception also try  //


// class tcf {
//     public static void main(String[] args) {
//         try 
//         {
//         System.out.println("Program starts");
//         int a = 10;
//         int b = 0;
//         int c = a / b;
//         System.out.println(c);
//         System.out.println("exception");

//         } 
//         catch (ArithmeticException e) 
//         {    int x = 10;
//              int y = 0;
//              int z = x / y;
//            System.out.println(z);
//           System.out.println("Cannot divide by zero: " + e);
//         } 
//         finally 
//         {
//             System.out.println("Finally block executed");
//         }
//         System.out.println("Program ends");
//     }

    
// }




                                     // all three exception //



class tcf {
    public static void main(String[] args) {
        try 
        {
        System.out.println("Program starts");
        int a = 10;
        int b = 0;
        int c = a / b;
        System.out.println(c);
        System.out.println("exception");

        } 
        catch (ArithmeticException e) 
        {    int x = 10;
             int y = 0;
             int z = x / y;
           System.out.println(z);
          System.out.println("Cannot divide by zero: " + e);
        } 
        finally 
        {     
             int m = 10;
             int n = 0;
             int p = m / n;
            System.out.println(p);
            System.out.println("Finally block executed");
        }
        System.out.println("Program ends");
    }

    
}



// This code is use only for learning purpose // 

// we write exception always under the try block //

// finally is use for encryption or security purpose //
                                    