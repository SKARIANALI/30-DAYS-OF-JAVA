                                 
                                 //Copy constructor //



// class A{
//     int a ; String name ;boolean c;

// A()
//     {

//         a=10; name =null; c=true;
//         System.out.println(a+" " +name +" " +c);
//     }

//     A (A ref){
//         a= ref.a;
//         name= ref.name;
//         c=ref.c;
//         System.out.println(a+" " +name +" " +c);
//     }
// }

// class copy{
//     public static void main(String[] args) {
//         A r=new A();
//         A r2=new A(r);
       
//     }
// }






// Copy Constructor but using Parameterized Constructor:

class A{
	int x;
	String y;
	A(int a, String b){
		x=a;
		y=b;		
	}
	A(A ref){
	x = ref.x;
	y = ref.y;
	}
	void show(){
		System.out.println(x+" "+y);
	}
}
 class copy {
	public static void main(String[] args) {
		A r = new A(24, "Sanna");
		r.show();
		A ref = new A(r);
		ref.show(); 		
	}
}