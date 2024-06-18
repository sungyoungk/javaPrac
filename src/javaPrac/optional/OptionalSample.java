package javaPrac.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalSample {
    public static void main(String[] args) throws Exception {
        OptionalSample sample = new OptionalSample();

        Optional<String> stringValue = Optional.of("Hello");
        sample.getOptionalData(stringValue);
    }

    private void createOptionalObject() {
        Optional<String> emptyString = Optional.empty(); // 빈 객체 생성

        String common = null;
        Optional<String> nullableString =Optional.ofNullable(common); // null 이 추가될 수 있는 객체

        Optional<String> commonString = Optional.of(common); // 반드시 데이터가 들어가 수 있는 객체
    }

    public void checkIfPresent() {
        System.out.println(Optional.of("present").isPresent());
        System.out.println(Optional.ofNullable(null).isPresent());
    }

    public void getOptionalData(Optional<String> data) throws Exception {
        String defaultValue = "default";

        // 1.
        String result = data.get();

        // 2.
        String result2 = data.orElse(defaultValue);

        // 3.
        Supplier<String> stringSupplier = new Supplier<String>(){
            @Override
            public String get() {
                return "GodOfJava";
            }
        };
        String result3 = data.orElseGet(stringSupplier);

        //4.
        Supplier<Exception>  exceptionSupplier = new Supplier<Exception>() {
            @Override
            public Exception get() {
                return new Exception();
            }
        };
        String result4 = data.orElseThrow(exceptionSupplier);


    }
}
