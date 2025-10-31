import java.util.ArrayDeque;
class arrdeq {
    public static void main(String[] args) {

        ArrayDeque<String> cars = new ArrayDeque<String>();  // predefined method //

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        cars.addFirst("Opel");
        System.out.println(cars);

        cars.addLast("Audi");
        System.out.println(cars);

        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());

        cars.removeFirst();
        System.out.println(cars);
        cars.removeLast();
        System.out.println(cars);

        cars.remove("BMW");
        System.out.println(cars);

        System.out.println(cars.size());

        cars.clear();
        System.out.println(cars);
    }

    
}
