import java.util.Scanner;

 class tribo {
    public static void main(String args[]) {
        int term,a=0,b=1,c=2,d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a term: ");
        term= sc.nextInt();
        for (int i=1;i<=term;i++)
        {
            System.out.print(a+" ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
           
        }
        
    }

    
}

