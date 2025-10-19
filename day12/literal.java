
// String literal method 
// String constant pool


class literal{
    public static void main(String[] args){

        String a="Arian";
        String b="Arian";
        System.out.println(a);
        System.out.println(b);
        

        a.concat("ali");   // donot bcz String are immutable
        System.out.println(a);  


        //    how can we do ?


     a=a.concat(" ali");  //new obj creation for a and  first one is destroy
     System.out.println(a);

    
        

        
        
    }

}