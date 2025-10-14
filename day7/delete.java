import java.util.Scanner;

class delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size and elements
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Get position to delete
        System.out.print("Enter position to delete (0 to " + (n-1) + "): ");
        int pos = sc.nextInt();

        // Step 3: Shift elements left
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];  //jei position e element ta thakbe otate faka kore debe
        }

           n--; // reduce array size (logically)

        // Step 4: Display updated array
        System.out.println("Array after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}






// import java.util.Scanner;

// class delete {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Step 1: Input array
//         System.out.print("Enter size of array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         System.out.println("Enter array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Step 2: Get value to delete
//         System.out.print("Enter value to delete: ");
//         int value = sc.nextInt();

//         // Step 3: Find position
//         int pos = -1;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == value) {
//                 pos = i;
//                 break; // delete first occurrence
//             }
//         }

//         if (pos == -1) {
//             System.out.println("Value not found!");
//         } else {
//             // Step 4: Shift elements left
//             for (int i = pos; i < n - 1; i++) {
//                 arr[i] = arr[i + 1];
//             }
//             n--; // reduce logical size

//             // Step 5: Print updated array
//             System.out.println("Array after deletion:");
//             for (int i = 0; i < n; i++) {
//                 System.out.print(arr[i] + " ");
//             }
//         }
//     }
// }
