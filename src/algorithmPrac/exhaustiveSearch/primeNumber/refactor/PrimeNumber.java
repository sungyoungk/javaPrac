package algorithmPrac.exhaustiveSearch.primeNumber.refactor;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @소수찾기 level2 p.211
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/42839
 */
public class PrimeNumber {

    /***
     *  @재귀_구성하기
     *  @상태 (acc, nums)
     *  @종료_조건 (acc, 0)
     *  @점화식 (acc, { })
     *      소수인 경우 (acc * 10 + nums(i), nums -1)
     *      아닌경우 -
     */

    private boolean isPrime(int number) {
        if (number <= 1) return false;

        for ( int i = 2;  i * i <= number; i++) {
            if (number % i == 0) return false;
        }

        return true;
    }

    private void getPrimes(int acc, List<Integer> numbers, Set<Integer> primes) {
        if (isPrime(acc)) primes.add(acc);

        for ( int i = 0; i < numbers.size(); i++) {
            int nextAcc = acc * 10 + numbers.get(i);

            List<Integer> nums = new ArrayList<>(numbers);
            nums.remove(i);

            getPrimes(nextAcc, nums, primes);
        }
    }

    public int solution(String numbers) {
     Set<Integer> primes = new HashSet<>();

     List<Integer> nums = numbers.chars().map(c -> c - '0').boxed().collect(Collectors.toList());

     getPrimes(0, nums, primes);
     return primes.size();
    }

    public static void main(String[] args) {
        PrimeNumber prime = new PrimeNumber();
        prime.solution("17");

        System.out.println(prime.solution("17"));
    }

}
