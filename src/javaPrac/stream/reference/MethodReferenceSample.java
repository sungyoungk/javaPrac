package javaPrac.stream.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MethodReferenceSample {
    public static void main(String[] args) {
        MethodReferenceSample sample = new MethodReferenceSample();
        String[] sArray = {"한국","일본","중국"};
        //sample.staticReference(sArray);
        // sample.createInstance();


        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        sample.multiiplyWithFor(integerList);
    }


    private static void printResult(String value) {
        System.out.println(value);
    }

    private void staticReference(String[] stringArray) {
        Arrays.stream(stringArray).forEach(MethodReferenceSample::printResult);
    }

    private void objectReference(String[] stringArray) {
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        Arrays.asList(stringArray).stream().sorted(String::compareToIgnoreCase).forEach(System.out::println);
    }

    interface MakeString{
        String fromBytes(char[] chars);
    }

    private void createInstance() {
    MakeString makeString = String::new;
        char[] chars = {'G', 'O', 'D', 'O', 'F', 'J', 'V', 'A'};
        String madeString = makeString.fromBytes(chars);
        System.out.println(madeString);
        }

    private void multiiplyWithFor(List<Integer> integerList) {
        integerList.stream().map(num -> num * 3).forEach(System.out::println);
    }
    }




