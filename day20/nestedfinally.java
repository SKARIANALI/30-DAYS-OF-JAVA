                                           // try-catch-finally inside finally block //



class nestedfinally {
    public static void main(String[] args) {
        System.out.println("Program starts");
        try 
        {
            System.out.println("Inside outer try block");
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } 
        catch (ArithmeticException e)
         {
            System.out.println("Caught ArithmeticException: " + e);
        } 
        finally 
        {
            System.out.println("Inside outer finally block");
            try 
            {
                System.out.println("Inside nested try block in finally");
                int[] arr = {1, 2, 3};
                System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException
            } 
            catch (ArrayIndexOutOfBoundsException e) 
            {
                System.out.println("Caught ArrayIndexOutOfBoundsException in nested catch: " + e);
            } 
            finally 
            {
                System.out.println("Inside nested finally block");
            }
        }
        System.out.println("Program ends");
    }

    
}
