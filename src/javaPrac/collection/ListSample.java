package javaPrac.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListSample {
    public static void main(String[] args) {

        ListSample sample = new ListSample();
        sample.checkArrayList9();
    }

    public void checkArrayList() {
        ArrayList list = new ArrayList();
        list.add(new Object());
        list.add(new ListSample());
        list.add(new Double(1));
    }

    public void checkArrayList2() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");

        for (String data : list) {
            System.out.println(data);
        }
    }

    public void checkArrayList3() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("0");
        list2.addAll(list);

        for (String data : list2) {
            System.out.println(data);
        }
    }

    public void checkArrayList4() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");

        ArrayList<String> list2 = list;
        list.add("OOOPs");
        list.add("another");



        for (String data : list2) {
            System.out.println(data);

        }
    }

    public void checkArrayList5() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        int listSize = list.size();

        for (int loop = 0; loop < listSize; loop++) {
            System.out.println("list.get(" + loop + ")= " + list.get(loop));
        }
    }

    public void checkArrayListIndexOf() {
        ArrayList<String> list = new ArrayList<>();
        list.add("김성영");
        list.add("김탁영");
        list.add("정영희");
        list.add("김탁영");

        System.out.println(list.indexOf("김탁영"));

    }

    public void checkArrayList6() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");

       Object[] objList =  list.toArray();
       String[] strList = list.toArray(new String[1]);


        for (String data : strList) {
            System.out.println(data);
        }
    }

    public void checkArrayList7() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        String[] stringArray = new String[2];
        String[] strList = list.toArray(stringArray);

        for (String data : strList) {
            System.out.println(data);
        }
    }

    public void checkArrayList8() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");

//        System.out.println("removed = " + list.remove(0));
//        System.out.println(list.remove("a"));

        ArrayList<String> temp = new ArrayList<>();
        temp.add("a");
        list.removeAll(temp);
        for (int loop = 0; loop < list.size(); loop++) {
            System.out.println("list.get(" + loop+ ")= " + list.get(loop));
        }
    }

    public void checkArrayList9() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
      
        System.out.println(list.set(0, "A") +  " is changed to A");

        for (int loop = 0; loop < list.size(); loop++) {
            System.out.println("list.get(" + loop + ") =" + list.get(loop));
        }
    }

}
