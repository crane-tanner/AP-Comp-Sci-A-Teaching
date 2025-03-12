public class Cat extends Pet {
    public String catBreed;
    public int id;

    public Cat(String name, int age, String breed, int ID) {
        super(name,age);
        catBreed = breed;
        id = ID;

    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
