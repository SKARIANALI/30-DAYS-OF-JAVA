// import java.util.LinkedList;
// class link {
//     public static void main(String[] args) {

//         LinkedList<String> cars = new LinkedList<String>();  // predefined method //

//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Ford");
//         cars.add("Mazda");
//         System.out.println(cars);

//         cars.addFirst("Opel");
//         System.out.println(cars);

//         cars.addLast("Audi");
//         System.out.println(cars);

//         System.out.println(cars.getFirst());
//         System.out.println(cars.getLast());

//         cars.add(0, "Toyota");
//         System.out.println(cars);
//         cars.add(2, "Honda");
//         System.out.println(cars);

//         cars.removeFirst();
//         System.out.println(cars);
//         cars.removeLast();
//         System.out.println(cars);

//         cars.remove(0);
//         System.out.println(cars);
//         cars.remove("BMW");
//         System.out.println(cars);

//         cars.set(0, "Opel");
//         System.out.println(cars);

//         System.out.println(cars.get(0));

//         cars.clear();
//         System.out.println(cars);
//     }

    
// }



import java.util.LinkedList;
class link {
    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<String>();  // predefined method //

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for(String str : cars)
        {
            System.out.println(str);
        }
    }
}
    

