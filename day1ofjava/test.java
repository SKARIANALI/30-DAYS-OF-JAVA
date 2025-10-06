// class test {

//         int a=10; //instance variable
//         static int b=20; //static variable


        
//     public static void main(String[] args) {
//         int c=30; //local variable
//         final int D=40; //final variable

//         test obj=new test(); //object creation without obj creation instance variable not access
//         System.out.println(obj.a); //ouput obj call
//         System.out.println(test.b);  //class name call
//         System.out.println(c);
//         System.out.println(D);
    
//     }


    
// }



class test{
    static int a=10;
    void show(){
        int b=20; //local variable
        System.out.println(a+" "+b); //a = 10, then a + " " becomes "10 "
        ++a;
        ++b;
        //System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        test ref=new test();
        ref.show();
        ref.show();
        ref.show();

    }

}



