// Interface Father with a common method
interface Father {
    void commonMethod();
}

// Interface Mother with the same common method
interface Mother {
    void commonMethod();
}

// Son implements both Father and Mother interfaces
class Son implements Father, Mother {
    // Implement the common method to resolve ambiguity
    public void commonMethod() {
        System.out.println("Son's implementation of commonMethod");
    }
}

// Daughter implements both Father and Mother interfaces
class Daughter implements Father, Mother {
    // Implement the common method to resolve ambiguity
    public void commonMethod() {
        System.out.println("Daughter's implementation of commonMethod");
    }
}

// Main class to demonstrate multiple inheritance using interfaces
public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        Daughter daughter = new Daughter();

        // Call the common method on both objects
        son.commonMethod();
        daughter.commonMethod();
    }
}

