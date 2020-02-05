package task4;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[100];
        Mouth[] mouthes = new Mouth[100];
        List<AbstractAnimal> list = new LinkedList<>();
        List<AbstractAnimal> list1 = new LinkedList<>();
        List<AbstractAnimal> list2 = new LinkedList<>();

        for(int i = 0; i < 100; i++){
            cats[i] = new Cat();
            mouthes[i] = new Mouth(i);
            if (cats[i].isCatched(mouthes[i])){
                list.add(cats[i]);
            } else {
                list1.add(cats[i]);
            }
        }

        for (int i = 0; i < list1.size(); i++){
            list2.add(list1.get(i));
        }
        for (int i = 0; i < list.size(); i++){
            list2.add(list.get(i));
        }

    }
}
