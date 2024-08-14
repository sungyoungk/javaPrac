package algorithmPrac.mobileNumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PhoneNumber {
    public final String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber.replaceAll("[^0-9]","");
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PhoneNumber)) return false;
        return phoneNumber.equals(((PhoneNumber) o).phoneNumber);
    }

    @Override
    public String toString() {
        return "phobeNumber{" +
                "phoneNumber='" +
                phoneNumber + '\'' +
                '}';
    }


    private static class Person{
        public final String name;
        private final List<PhoneNumber> numbers;

        public Person(String name) {
            this.name = name;
            numbers = new ArrayList<>();
        }

        public void addPhoneNumber(PhoneNumber number) {
            numbers.add(number);
        }

        public boolean hasPhoneNumber(PhoneNumber phoneNumber) {
            return numbers.contains(phoneNumber);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", numbers=" + numbers +
                    '}';
        }

    }


    private static class PhoneBook{
        private final Set<Person> people;

        private PhoneBook(){
            people = new HashSet<>();
        }

        public void addPerson(Person person) {
            people.add(person);
        }

        public Person search(PhoneNumber phoneNumber) {
            return people.stream()
                    .filter(p -> p.hasPhoneNumber(phoneNumber))
                    .findFirst()
                    .orElse(null);
        }

        @Override
        public String toString(){
            return "PhoneBook{" +
                    "people=" + people + '}';
        }
    }

    public static void main(String[] args) {
//        Person person1 = new Person("홍길동");
//        person1.addPhoneNumber(new PhoneNumber("010-3643-0446"));
//        person1.addPhoneNumber(new PhoneNumber("010-3886-5435"));
//
//        Person person2 = new Person("김철수");
//        person2.addPhoneNumber(new PhoneNumber("010-1234-5678"));

        Person person3 = new Person("김영희");
        person3.addPhoneNumber(new PhoneNumber("010-3643-0446"));
        Person person4 = new Person("정영애");
        person4.addPhoneNumber(new PhoneNumber("010-1234-5678"));



        PhoneBook phoneBook = new PhoneBook();
//        phoneBook.addPerson(person1);
//        phoneBook.addPerson(person2);
        phoneBook.addPerson(person3);
        phoneBook.addPerson(person4);


        System.out.println( phoneBook.search(new PhoneNumber("01036430446")));
        System.out.println(phoneBook.search(new PhoneNumber("01012345678")));


    }


}
