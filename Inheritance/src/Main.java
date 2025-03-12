public class Main { //Inheritance is when a new class (subclass) inherits properties and behaviors from
                    // an existing class (superclass).
                    // It establishes an "is-a" relationship -
                    // allowing code reusability and establishing a hierarchical structure

    public static void main(String[] args) {
        Cat obj = new Cat("Sammy", 5, "Siamese", 3290);
        obj.makeNoise();

    }
}



//Compile-time polymorphism = method overloading
//run-time polymorphism = method overriding