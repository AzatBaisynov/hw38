package task4;

import java.util.Random;

public class Cat extends AbstractAnimal{
    public Cat(){

    }

    public boolean isCatched(Mouth m){
        Random rd = new Random();
        int i = rd.nextInt(2-0)+0;
        if (i != 0){
            eatingMouth(m);
            return true;
        } else {
            drinkingMilk();
            return false;
        }
    }

    private void eatingMouth(Mouth m){
        System.out.println("eating this tasty mouth number " + m.getNumber());
    }

    private void drinkingMilk(){
        System.out.println("drinking milk");
    }
}
