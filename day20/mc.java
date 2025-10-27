

//                                // multiple catch block //
// class mc {
//     public static void main(String[] args) {
//         System.out.println("Program starts");
//         try 
//         {
//             int a = 10;
//             int b = 0;
//             int c = a / b;
//             System.out.println(c);
//         } 
//         catch (ArithmeticException e) 
//         {
//             System.out.println("Cannot divide by zero: " + e);
//         } 
//         catch (ArrayIndexOutOfBoundsException e) 
//         {
//             System.out.println("Array index out of bounds: " + e);
//         }
//         System.out.println("Program ends");     
//     }

    
// }







// class mc {
//     public static void main(String[] args) {
//         System.out.println("Program starts");
//         try 
//         {
//             int a = 10;
//             int b = 0;
//             int c = a / b;
//             System.out.println(c);

//             int x[] = {1, 2, 3};
//             System.out.println(x[3]);

//             String str = null;
//             System.out.println(str.toUpperCase());

//         } 
//         catch (ArithmeticException e) 
//         {
//             System.out.println("Cannot divide by zero: " + e);
//         } 
//         catch (ArrayIndexOutOfBoundsException e) 
//         {
//             System.out.println("Array index out of bounds: " + e);
//         }
//         catch (Exception e )  // Handle all the exceptions its a super class //
//         {
//              System.out.println("All types exception handle ");   
//         }
//         System.out.println("Program ends");
    
//     }

    
// }







// class mc {
//     public static void main(String[] args) {
//         System.out.println("Program starts");
//         try 
//         {
//             int a = 10;
//             int b = 2;
//             int c = a / b;
//             System.out.println(c);

//             int x[] = {1, 2, 3};
//             System.out.println(x[2]);

//             String str = "arian";
//             System.out.println(str.toUpperCase());

//         } 
//         catch (ArithmeticException e) 
//         {
//             System.out.println("Cannot divide by zero: " + e);
//         } 
//         catch (ArrayIndexOutOfBoundsException e) 
//         {
//             System.out.println("Array index out of bounds: " + e);
//         }
//         catch (Exception e )  // Handle all the exceptions its a super class //
//         {
//              System.out.println("All types exception handle ");   
//         }
//         System.out.println("Program ends");
    
//     }

    
// }






// class mc {
//     public static void main(String[] args) {
//         System.out.println("Program starts");
//         try 
//         {
//             int a = 10;
//             int b = 2;
//             int c = a / b;
//             System.out.println(c);

//             int x[] = {1, 2, 3};
//             System.out.println(x[2]);

//             String str = null;
//             System.out.println(str.toUpperCase());

//         } 
//         catch (ArithmeticException e) 
//         {
//             System.out.println("Cannot divide by zero: " + e);
//         } 
//         catch (ArrayIndexOutOfBoundsException e) 
//         {
//             System.out.println("Array index out of bounds: " + e);
//         }
//         catch (Exception ref )  // Handle all the exceptions its a super class //
//         {
//              System.out.println("All types exception handle ");   // Exception ref = new NullPointerException();
//         }
//         System.out.println("Program ends");
    
//     }

// }




class mc {
    public static void main(String[] args) {
        System.out.println("Program starts");
        try 
        {
            int a = 10;
            int b = 2;
            int c = a / b;
            System.out.println(c);

            int x[] = {1, 2, 3};
            System.out.println(x[2]);

            String str = null;
            System.out.println(str.toUpperCase());

        } 
        // catch (ArithmeticException e) 
        // {
        //     System.out.println("Cannot divide by zero: " + e);
        // } 
        // catch (ArrayIndexOutOfBoundsException e) 
        // {
        //     System.out.println("Array index out of bounds: " + e);
        // }
        catch (Exception ref )  // Handle all the exceptions its a super class //
        {
             System.out.println("All types exception handle ");   // Exception ref = new NullPointerException();
        }
        System.out.println("Program ends");
    
    }

}