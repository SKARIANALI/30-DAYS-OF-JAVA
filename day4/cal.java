import java.util.Scanner;
class cal{
 public static void main(String[] args){

  int a,b,ch;
  System.out.println("enter two numbers : " );
  
   Scanner r=new Scanner(System.in); //input
   a=r.nextInt();
   b=r.nextInt();
   
   System.out.println("enter your choice : ");


   ch=r.nextInt();

   switch(ch){
   
     case 1:

 System.out.println(" add : " +(a+b));
break;

     
     case 2: 
 System.out.println("sub: " +(a-b));
 break;
     case 3:
 System.out.println("mul : " +(a*b));
 break;
     
case 4:
 System.out.println("div : " +(a/b));
 break;

   }
   
 }
}
