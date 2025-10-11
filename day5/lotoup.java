 import java.util.Scanner;
 class lotoup {
    public static void main(String[] args) {
        char ch,ch2,ch3;
        Scanner ref=new Scanner(System.in);
        System.out.println("enter a character : ");
        ch=ref.next().charAt(0);
       
        if(ch>='A' && ch<='Z'){
            ch2=Character.toLowerCase(ch);
            System.out.println(ch2);
        }
        else if(ch>='a' && ch<='z'){
            ch3=Character.toUpperCase(ch);
            System.out.println(ch3);
        }
        else {
            System.out.println("wrong input");
        }
        
    }
   


    
}
