import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> favorite_foods = new ArrayList<>();

        favorite_foods.add("Pizza");
        favorite_foods.add("Teriyaki");
        favorite_foods.add("Hamburger");
        favorite_foods.set(2, "Cheeseburgers");
        for (String favoriteFood : favorite_foods) {
            System.out.println(favoriteFood);
        }
    }
    }
