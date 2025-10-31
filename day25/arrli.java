import java.util.ArrayList;
class arrli
{
   public static void main(String[] args) {
       ArrayList<String> cars = new ArrayList<String>();
       cars.add("Volvo");
       cars.add("BMW");
       cars.add("Ford");
       cars.add("Mazda");
       System.out.println(cars);

       cars.add(0, "Opel");
       System.out.println(cars);
       cars.add(2, "Audi");
       System.out.println(cars);

       cars.remove(0);
       System.out.println(cars);
       cars.remove("BMW");
       System.out.println(cars);

       cars.set(0, "Opel");  // replace
       System.out.println(cars);

       System.out.println(cars.get(0)); 

       cars.clear();
       System.out.println(cars);

       
   }
}