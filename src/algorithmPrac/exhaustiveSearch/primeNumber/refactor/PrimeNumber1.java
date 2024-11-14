package algorithmPrac.exhaustiveSearch.primeNumber.refactor;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @소수찾기 level2 p.211
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/42839
 */
public class PrimeNumber1 {

    /***
     *  @재귀_구성하기
     *  @상태 (acc, nums)
     *  @종료조건 (acc, 0)
     *  @점화식 (acc, {})
     *   소 수 : (acc * 10 + nums(i), nums -1)
     *
     */

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for ( int i =2 ; i *i <= number; i++) {
            if(number % i == 0) return false;
        }

        return true;
    }

    private void getPrimes(int acc, List<Integer> nums, Set<Integer> primes ) {
        if(isPrime(acc)) {
            primes.add(acc);
        }

        for ( int i = 0; i < nums.size(); i ++) {
            int nextAcc = acc * 10 + nums.get(i);

            List<Integer> numbers = new ArrayList<>(nums);
            numbers.remove(i);

            getPrimes(nextAcc, numbers, primes);
        }
    }

    public int solution(String numbers) {
     List<Integer> nums = numbers.chars().map(c -> c - '0').boxed().collect(Collectors.toList());
     Set<Integer> primes = new HashSet<>();

     getPrimes(0, nums, primes);

     return primes.size();
    }

    public static void main(String[] args) {
        PrimeNumber1 prime = new PrimeNumber1();
        prime.solution("17");

        System.out.println(prime.solution("17"));
    }

}
