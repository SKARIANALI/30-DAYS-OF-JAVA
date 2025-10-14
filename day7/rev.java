
import java.util.Scanner;
class rev{
    public static void main(String[] args) {
        int size,i ;
        System.out.println("enter size of elements :"); //size of an elements
        Scanner ref=new Scanner(System.in); //input size
        size=ref.nextInt();
        int a[]= new int[size]; //run time size 
        System.out.println("enter array elements :");

        for(i=0;i<size;i++)
        {
        a[i]=ref.nextInt(); //array input 
        }
        System.out.println("array elements are " ); 
        for(i=0;i<size;i++)
        {
        System.out.println(a[i]); //print all array elements 
        }

        System.out.println("reverse array elements are " );
        for(i=size-1;i>=0;i--)
        {
        System.out.println(a[i]); //print revserse all array elements 
        }
       
       
    }
}
