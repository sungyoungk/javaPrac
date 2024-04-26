package javaPrac.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {
        SetSample sample = new SetSample();

        String[] cars2 = new String[0];

        String[] cars = new String[]{
            "Tico", "Sonata", "BMW", "Benz",
                "Lexus", "Mustang", "Grandeur",
                "The Beetle", "Mini Cooper", "i30",
                "BMW", "Lexus", "Carnibal", "SM5",
                "SM7", "SM3", "Tico"
        };

        System.out.println(sample.getCarKinds(cars));
    }

    public int getCarKinds(String[] strArray) {

        if(strArray == null || strArray.length == 0) return 0;
        if(strArray.length == 1) return 1;

        Set<String> cars = new HashSet<String>();
        for (String data : strArray) {
            cars.add(data);
        }
        // printCarSet(cars);
        printByIterator(cars);
        return cars.size();
    }

    private void printCarSet(Set<String> cars) {
        int count = 0;
        for (String data : cars) {
            count++;
            System.out.println(count +". " + data);
        }
    }

    private void printByIterator(Set<String> cars) {
        Iterator<String> carIterator = cars.iterator();

        if (cars.contains("Tico")) System.out.println("There is Tico from the list");

        int count = 0;
        while (carIterator.hasNext()) {
            count ++;
            System.out.println(count + ". " + carIterator.next() + " ");
        }
        System.out.println();
    }
    }

