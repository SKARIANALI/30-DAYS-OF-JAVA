                                      // LIFO //
import java.util.Stack;
class stac {
    public static void main(String[] args) {

        Stack<String> cars = new Stack<String>();  // predefined method //

        cars.push("Volvo");
        cars.push("BMW");
        cars.push("Ford");
        cars.push("Mazda");
        System.out.println(cars);

        cars.pop();
        System.out.println(cars);
        
        System.out.println(cars.empty());

        System.out.println(cars.size());

        cars.clear();
        System.out.println(cars);
    }

    
}
