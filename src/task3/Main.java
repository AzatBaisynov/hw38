package task3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void addIfNotSame(Person p, List<Person> list, HashSet<Person> set) {
        list.add(p);
        for (int i = 0; i < list.size(); i++) {
            if (p.isSameAge(list.get(i))) {
                try {
                    throw new Exception();
                } catch (Exception e) {
                    System.err.println("added same aged person");
                    e.printStackTrace();
                } finally {
                    for (int j = 0; i < list.size(); j++) {
                        if (p.isSameAge(list.get(i))) {
                            set.add(p);
                        }
                    }
                    System.out.println(list);
                }
            }
        }
    }


    public static void main(String[] args) {
        LinkedList<Person> list = new LinkedList<>();
        HashSet<Person> set = new HashSet<>();

        Person one = new Person(23,"Azat");
        Person second = new Person(20, "Atay");
        Person third = new Person(20, "Shaltai");

        addIfNotSame(one, list, set);
        addIfNotSame(second, list, set);
        addIfNotSame(third, list, set);
    }
}
