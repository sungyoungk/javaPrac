package algorithmPrac.personal;

public class SHPrice {



    public int solution(int price) {
        double result = 0;

        result = (price - (price * 0.3)) * 0.2;

        return (int)Math.round(result);
    }

    public static void main(String[] args) {
        SHPrice sh = new SHPrice();

        int price = 190000000;

        System.out.println(sh.solution(price));
    }
}
