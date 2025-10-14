
import java.util.Scanner;
class small {
    public static void main(String[] args) {
       int a[] = new int[5];
       Scanner ref=new Scanner(System.in);
       System.out.println("enter array elements :");
       for(int i=0;i<a.length;i++){
        a[i]=ref.nextInt();
       }


         int min = a[0]; // Initialize max with the first element


        for (int i = 1; i < a.length; i++) {  //start the second loop from index 1 (since max already has a[0]
            if (a[i] < min) {
                min = a[i]; // Update max if current element is larger
            }
        }
        System.out.println("The smallest element in the array is: " + min);
    }

}

