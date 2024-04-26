package javaPrac.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class QueueSample {
    public static void main(String[] args) {
        QueueSample sample = new QueueSample();
        sample.checkLinkedList();
    }


    public void checkLinkedList() {
        LinkedList<String> link = new LinkedList<>();
        link.add("a");
        link.addFirst("b");
        System.out.println(link);
        link.offerFirst("c");
        System.out.println(link);
        link.addLast("d");
        System.out.println(link);
        link.offer("e");
        System.out.println(link);
        link.offerLast("f");
        System.out.println(link);
        link.push("g");
        System.out.println(link);
        link.add(0, "h");
        System.out.println(link);
        System.out.println("ex= " + link.set(0, "i"));
        System.out.println(link);


        ListIterator<String> iterator = link.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "(" +iterator.nextIndex() + ")");
        }
        System.out.println();
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() +"(" +iterator.previousIndex() + ")");
        }
    }
}
