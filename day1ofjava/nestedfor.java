 class nestedfor {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {    //row
            for (int j = 1; j <= 3; j++) {  //col
                System.out.print( "* ");   //outer loop(i) 1 time excute inner loop(j) 3 times 
            }
            System.out.println(); // next line provide 
           
        }
    }

    
}
