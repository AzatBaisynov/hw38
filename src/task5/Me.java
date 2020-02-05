package task5;

public class Me {
    public Me() {
    }

    public int eatFood(int time, Food[] foods){
        int sum = 0;
        for (int i = 0; i < foods.length; i++){
            sum += foods[i].getPrice();
        }
        return sum;
    }
}
