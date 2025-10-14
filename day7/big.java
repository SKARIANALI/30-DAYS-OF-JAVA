// class big {
//     public static void main(String[] args) {
//        int a[] = {10, 20, 30, 40, 50};
//        int max = a[0]; // Initialize max with the first element


//         for (int i = 1; i < a.length; i++) {
//             if (a[i] > max) {
//                 max = a[i]; // Update max if current element is larger
//             }
//         }
//         System.out.println("The largest element in the array is: " + max);
//     }

// }





import java.util.Scanner;
class big {
    public static void main(String[] args) {
       int a[] = new int[5];
       Scanner ref=new Scanner(System.in);
       System.out.println("enter array elements :");
       for(int i=0;i<a.length;i++){
        a[i]=ref.nextInt();
       }


         int max = a[0]; // Initialize max with the first element


        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i]; // Update max if current element is larger
            }
        }
        System.out.println("The largest element in the array is: " + max);
    }

}

