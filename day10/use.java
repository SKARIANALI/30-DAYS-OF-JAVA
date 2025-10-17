import java.util.Scanner;
class use {

    int a,b; //instance variable
    int add , mul , sub , div , rem;

    public static void main(String[] args) 

    {
       use ref=new use ();
       ref.input();
       ref.process();    //all are non static thats why we create obj and call them 
       ref.output();


    }

    void input()

    {      System.out.println("enter two numbers :");
           Scanner ref=new Scanner(System.in);
           a=ref.nextInt();
           b=ref.nextInt();

    }
    
    void process()
    { 
       
       
        add=a+b;
        mul=a*b;
        sub=a-b;
        div=a/b;
        rem=a%b;


       
    }



    void output()
    {
        System.out.println("sum is "+add);
        System.out.println("mul is "+mul);
        System.out.println("sub is "+sub);
        System.out.println("div is "+div);
        System.out.println("rem is "+rem);

    }
}
