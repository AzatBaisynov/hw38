package task5;

public class Main {
    public static void main(String[] args) {
        Food[] breakfast = {new Food("Eggs", 100), new Food("Bread",0)};
        Food[] lunch = {new Food("Steak", 500),new Food("Wine",400),new Food("Salad", 0)};
        Food[] dinner = {new Food("Milk",0), new Food("Cookies",150)};


        Me azat = new Me();
        System.out.println(azat.eatFood(2,lunch));
    }
}
