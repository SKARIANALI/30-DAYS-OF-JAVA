 import java.util.Arrays;
 import java.util.Scanner;  
 class equals {
    public static void main(String[] args) {
        int a[] =new int[5] ;
        int b[] =new int[5] ;
        int c[] =new int[5] ;
         Scanner ref=new Scanner(System.in);
         System.out.println("ENTER DATA in array a :");
         for(int i=0;i<a.length;i++){
            a[i]=ref.nextInt();
         }
         System.out.println("ENTER DATA in array b :");
         for(int i=0;i<b.length;i++){
            b[i]=ref.nextInt();
         }
          System.out.println("ENTER DATA in array c:");
         for(int i=0;i<c.length;i++){
            c[i]=ref.nextInt();
         }
         

         Arrays.equals(a, b);  //return type true or false ;
         Arrays.equals(a, c);
         boolean result = Arrays.equals(c, b);

         System.out.println(Arrays.equals(a, b));
         System.out.println(Arrays.equals(a, c));
         System.out.println("b and c are eual: " + result);

        
        
    }
}

       