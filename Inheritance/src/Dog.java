

public class Dog extends Pet {
    private final String breed;
    private final String color;

    public Dog(String name, int age, String breed, String color) {
        super(name, age);
        this.breed = breed;
        this.color = color;

    }
    @Override
    public void makeNoise() {
        System.out.println("Bark!");
    }

    public String getBreed() {
        return breed;
    }
    public String getColor() {
        return color;
    }
    public String printInfo() {
        return "Name: " + name + ", Age: " + age + ", Breed: " + getBreed() + ", Color: " + getColor();
    }
}
