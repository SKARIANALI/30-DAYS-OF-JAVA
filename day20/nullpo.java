                                          // NullPointerException //


// class nullpo 
// {
//     public static void main(String[] args) {
//         System.out.println("Program starts");
//         String str = null;
//         try 
//         {
//             System.out.println(str.toUpperCase()); // null cannot be casted 
//         }
//         catch(NullPointerException e)
//         {
//              System.out.println("null cannot be casted : "+e);
//         }

//         System.out.println("Program ends");   
//     }
// }  


class nullpo 
{
    public static void main(String[] args) {
        System.out.println("Program starts");
        String str = "arian";
        try 
        {
            System.out.println(str.toUpperCase()); // output 
        }
        catch(NullPointerException e)
        {
             System.out.println("null cannot be casted : "+e); // if try block execute then catch block cannot execute // 
        }

        System.out.println("Program ends");   
    }
}                   