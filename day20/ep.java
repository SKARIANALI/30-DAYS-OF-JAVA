                                       // Exception Handling //

// ArithmeticException //


class ep 
{
    public static void main(String[] args) {
        System.out.println("Program starts");
            int a = 10;
            int b = 0;
        try {
            int c = a / b; // This will throw ArithmeticException
            System.out.println(c);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Cannot divide by zero: " + e);
        }
        System.out.println("Program ended...");
    
    }   

}

// catch (Exception e) // here e is a ref var // (Exception e) is a super class that handle all types of exception //