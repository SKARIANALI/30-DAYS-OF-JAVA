                                       //Console class //

                        // readLine() and readPassword() methods in Java //



import java.io.Console;
class cons{
    public static void main(String[] args) {
       String str ;
       char ch[];
       
       Console obj=System.console();
       System.out.println("Enter username : ");
       str=obj.readLine();
       System.out.println("Enter password : "); 
       ch=obj.readPassword();

       
        System.out.println("Username : "+str);
        System.out.println("Password : " +ch);
       

        //converts the character array (char[]) into a String.

        String show = String.valueOf(ch);
        System.out.println("Actual Password is : " +show);





    }

    
}
