import java.util.Scanner;
class addmat{
    public static void main(String[] args) {
        int r,c,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row: ");
        r=sc.nextInt();
        System.out.print("Enter coloumn: ");
        c=sc.nextInt();
        int arr[][]=new int[r][c];  //run time matrix elements  input 
        int arr1[][]=new int[r][c];
        int arr2[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.printf("Enter element arr[%d][%d] at first matrix : \n",i,j);
                arr[i][j]=sc.nextInt();  //array elements input in matrix 1st matrix 
            }
        }

        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.printf("Enter element arr[%d][%d] at second matrix : \n",i,j);
                arr1[i][j]=sc.nextInt();  
            }
        }
            
         System.out.println("Final array is : ");

            for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                   arr2[i][j]=arr[i][j]+arr1[i][j];
                   System.out.print(arr2[i][j]+" ");  
            }
              System.out.println();
        }
    }

}