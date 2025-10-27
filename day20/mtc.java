                           // multiple try catch block //
class mtc {
    public static void main(String[] args) {
        System.out.println("Program starts");
        try 
        {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Cannot divide by zero: " + e);
        } 

        try 
        {
                int a[] = {1, 2, 3};
                System.out.println(a[3]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index out of bounds: " + e);
        }
        System.out.println("Program ends");     
    }

    
}
