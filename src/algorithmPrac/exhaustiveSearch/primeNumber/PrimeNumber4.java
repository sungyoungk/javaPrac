package algorithmPrac.exhaustiveSearch.primeNumber;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @소수찾기 level2 p.211
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/42839
 */
public class PrimeNumber4 {

    /***
     *  @재귀_구성하기
     *  @상태 ( acc, nums)
     *  @종료_조건 ( acc, 0)
     *  @점화식 ( acc, {})
     *      소수인 경우 (acc * 10 + nums(i), nums -1)
     *      아닌경우 -
     */

    private boolean isPrime(int number) {
        if (number <= 1) return false;

        for(int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    private Set<Integer> getPrimes(int acc, List<Integer> numbers) {
        Set<Integer> primes = new HashSet<>();
        if(isPrime(acc)) primes.add(acc);

        for (int i = 0; i < numbers.size(); i ++) {
            int nextNum = acc * 10 + numbers.get(i);

            List<Integer> nums = new ArrayList<>(numbers);
            nums.remove(i);
            primes.addAll(getPrimes(nextNum, nums));
        }
        return primes;
    }

    public int solution(String numbers) {
    List<Integer> nums = numbers.chars().map(c -> c - '0')
                                        .boxed()
                                        .collect(Collectors.toList());

    Set<Integer> answer = getPrimes(0, nums);

    return answer.size();
    }

    public static void main(String[] args) {
        PrimeNumber4 prime = new PrimeNumber4();
        prime.solution("17");

        System.out.println(prime.solution("17"));
    }

}
