                                    // user defined exception //

class udexc 
{
    public static void main(String[] args) {
        try
        {
            vote(12); // vote  method call //
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
    }
      public static void vote(int  age) throws InvalidAgeException   // exception declaretion 
       {
            if (age < 18) 
            {
                throw new InvalidAgeException("Age is not valid to vote.");
            } 
            else 
            {
                System.out.println("Welcome to vote!");
            }
        } 
}
// user defined exception class must be created //
class InvalidAgeException extends Exception // extends Exception //(Here Exception is a superclass)
 {
    InvalidAgeException(String message) // constuctor //
    {
        System.out.println(message); // message prints which type of exception we can get user defined  //
    }

}