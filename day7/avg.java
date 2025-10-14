import java.util.Scanner;
class avg {
    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);
        System.out.println("enter size of  elements :");
        int size ;
        int avgr = 0; //int must
        int sum=0; //int must
        size=ref.nextInt(); 
        int a[]= new int[size]; //run time size 
        System.out.println("enter array elements :");

        for(int i=0;i<size;i++){
            a[i]=ref.nextInt(); //array input 
        }
        for(int b : a){
            sum = (sum+b); 
          }

         avgr=sum/size;
        System.out.println("average of array elements is: " + avgr);
        
        

    }
}




// class avg {
//     public static void main(String[] args) {
//         int avgr = 0; //int must
//         int sum=0; //int must
//         int a[]= {10,20,30};  
//         for(int b : a){
//             sum = (sum+b); 
           
//         }

//          avgr=sum/3;


//         System.out.println("average of array elements is: " + avgr);
        
        

//     }

// }

