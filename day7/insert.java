import java.util.Scanner;

class insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input size and elements
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size+1]; //extra space for insert an element at the last node

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Input position and new element
        System.out.print("Enter position to insert (0 to " + size + "): ");
        int pos = sc.nextInt();
        System.out.print("Enter element to insert: ");
        int element = sc.nextInt();

        
        // Step 3: Shift elements to the right  
        for (int i = size; i > pos; i--) {
            arr[i] = arr[i - 1];  //condition true hole oii position ta faka hoye jabe
        }

        // Step 4: Insert new element
        arr[pos] = element;
        size++; // Increment size after insertion ata na korle akta element kom dekhabe


        // Step 5: Display new array
        System.out.println("Array after insertion:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
