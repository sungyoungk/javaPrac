package javaPrac.arrayPrac;


public class ArrayLotto {

    int[] lottoNumbers;

    public void init() {
        this.lottoNumbers = new int[7];
        lottoNumbers[0] = 5;
        lottoNumbers[1] = 12;
        lottoNumbers[2] = 23;
        lottoNumbers[3] = 25;
        lottoNumbers[4] = 41;
        lottoNumbers[5] = 50;
        lottoNumbers[6] = 2;
        // lottoNumbers[7] =2;
    }


    public static void main(String[] args) {
        ArrayLotto arrayLotto = new ArrayLotto();
        arrayLotto.init();

        System.out.println(arrayLotto.lottoNumbers[6]);





    }



}