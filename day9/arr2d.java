//  class arr2d {
//     public static void main(String[] args) {
//         int a[][] = { { 10, 20, 30, 40 }, { 50, 60, 70, 80 } };

//         for (int i = 0; i < 2; i++) {   // rows 
//             for (int j = 0; j < 4; j++) {  //coloumn
//                 System.out.print(" " + a[i][j]);
//             }
//             System.out.println();
//         }
//     }

    
// }






import java.util.Scanner;
class arr2d{
    public static void main(String[] args) {
        int r,c,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row: ");
        r=sc.nextInt();
        System.out.print("Enter coloumn: ");
        c=sc.nextInt();
        int arr[][]=new int[r][c];  //run time matrix elements  input 
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.printf("Enter element arr[%d][%d]: \n",i,j);
                arr[i][j]=sc.nextInt();  //array elements input in matrix 
            }
        }
        System.out.println("Final array is : ");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");  
            }
            System.out.println();
        }

    }

}