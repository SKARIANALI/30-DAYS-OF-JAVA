import java.util.Scanner;
class vowel {
    public static void main(String[] args) {
        char ch ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        ch = sc.next().charAt(0);   //char input method



        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }

}
