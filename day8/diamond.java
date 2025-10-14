class diamond {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) // for rows
        {
            for (j = 5; j > i; j--) { // for space
                System.out.print(" ");
            }
            for (k = 1; k <=2*i-1 ; k++) { // for coloumn
                System.out.print("*");  
            }
            System.out.println(); // for next line

        }

        for (i = 4; i >= 1; i--) // for rows
        {
            for (j = 5; j > i; j--) { // for space
                System.out.print(" ");
            }
            for (k = 1; k <=2*i-1 ; k++) { // for coloumn
                System.out.print("*");  
            }
            System.out.println(); // for next line

        }
    }

    
}

