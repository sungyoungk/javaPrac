package algorithmPrac.exhaustiveSearch.primeNumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @소수찾기 level2 p.211
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/42839
 */
public class PrimeNumber3 {


    /**
     *   [  상태 ]  (acc, nums)
     *   [종료조건]  (acc, 0)
     *   [ 점화식] (acc, {})
     *           소수인 경우 : (acc * 10 + nums(i), nums -1)
     *           아닌 경우  :  (acc, nums -1)
     */

    private boolean isPrime(int num) {

        if ( num <= 1) return false;

        for(int i = 2; i * i <= num; i++) {
            if ( num % i == 0) return false;
        }
        return true;
    }

    private Set<Integer> getPrime(int acc, List<Integer> nums) {
        Set<Integer> primes = new HashSet<>();

        if(isPrime(acc)) primes.add(acc);

        for ( int i = 0; i < nums.size(); i ++) {

            int nextAcc = acc * 10 + nums.get(i);
            List<Integer> nextNumbers = new ArrayList<>(nums);

            nextNumbers.remove(i);
            primes.addAll(getPrime(nextAcc, nextNumbers));
        }

        return primes;
    }

    public int solution(String numbers) {
       List<Integer> nums = numbers.chars()
               .map(c -> c - '0')
               .boxed()
               .collect(Collectors.toList());

       return getPrime(0, nums).size();
    }

    public static void main(String[] args) {
        PrimeNumber3 prime = new PrimeNumber3();
        prime.solution("17");
    }

}
