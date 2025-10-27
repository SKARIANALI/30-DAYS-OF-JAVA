                                    // NumberFormatException //

// class nfe 
// {  
//     public static void main(String[] args) {
//         System.out.println("Program starts");

//         String str = "abc";
//         // String str = "1234";  // number type String 
//         try 
//         {
//             int a = Integer.parseInt(str); // This will throw NumberFormatException
//             System.out.println(a);
//         } 
//         catch (NumberFormatException e) 
//         {
//             System.out.println("Cannot convert string to integer: " + e);
//         }
//         System.out.println("Program ends");
//     }
    
// }




class nfe 
{  
    public static void main(String[] args) {
        System.out.println("Program starts");

        String str = "abc";
        // String str = "1234";  // number type String 
        try 
        {
            int a = Integer.parseInt(str); // This will throw NumberFormatException
            System.out.println(a);
        } 
        // catch (NumberFormatException e)
        catch (ArithmeticException e)  // exception mismatched  
        {
            System.out.println("Cannot convert string to integer: " + e);
        }
        System.out.println("Program ends");
    }
    
}

 // output : exception mismatch so this is a abnormal termination // 

