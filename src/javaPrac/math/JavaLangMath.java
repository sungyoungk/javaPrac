package javaPrac.math;

public class JavaLangMath {
    public static void main(String[] args) {

        JavaLangMath javaLangMath = new JavaLangMath();
        // javaLangMath.mathCheck1();
        javaLangMath.mathCheck2();

    }


    public void mathCheck1() {
        double num1 = 45;
        double num2 = -45;

        // Math.abs() 절대값 구하기
        System.out.println("Math.abs() : 절대값 구하기");
        System.out.println(Math.abs(num1));
        System.out.println(Math.abs(num2));

        // Math.signNum 부호 확인
        System.out.println("Math.signNum() : 부호 확인하기");
        System.out.println(Math.signum(num1));
        System.out.println(Math.signum(num2));
        System.out.println(Math.signum(0));

        // Math.max(), Math.min() 대소 비교하기
        System.out.println("Math.max/Math.min() : 대소 비교하기");
        System.out.println(Math.max(num1, num2));
        System.out.println(Math.min(num1, num2));
    }

    public void mathCheck2() {
        double[] numbers = new double[]{
                3.15, 3.62, -3.15, -3.62
        };

        for (double number : numbers) {
            System.out.println(number);
            System.out.println("Math.round() :" + Math.round(number));
            System.out.println("Math.rint() :" + Math.rint(number));
            System.out.println("Math.ceil()" + Math.ceil(number));
            System.out.println("Math.floor()" + Math.floor(number));
            System.out.println();
        }
    }

}
