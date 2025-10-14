import java.util.Scanner;
class length{
    public static void main(String[] args) {
        int i ;
        Scanner ref=new Scanner(System.in); 
        int a[]= new int[5]; //run time size 
        System.out.println("enter array elements :");

        for(i=0;i<a.length;i++)
        {
        a[i]=ref.nextInt(); //array input 
        }
        System.out.println("array elements are " ); 
        for(i=0;i<a.length;i++)
        {
        System.out.println(a[i]); //print all array elements 
        }

        System.out.println("length of  array elements are " +a.length );
       
       
    }
}
