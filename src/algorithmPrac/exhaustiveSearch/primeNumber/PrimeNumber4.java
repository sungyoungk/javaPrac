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
public class PrimeNumber4 {

    /***
     *  @재귀_구성하기
     *  @상태 (acc, nums)
     *  @종료_조건 (acc, 0)
     *  @점화식 (acc, { })
     *      소수인 경우 (acc * 10 + nums(i), nums -1)
     *      아닌경우 -
     */

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    private Set<Integer> getPrimes(int acc, List<Integer> nums) {
        Set<Integer> primes = new HashSet<>();
        if (isPrime(acc)) primes.add(acc); // 소수면 primes Set 에 넣기

        for (int i = 0; i < nums.size(); i++) {
            int nextAcc = acc * 10 + nums.get(i);
            List<Integer> nextNums = new ArrayList<>(nums);
            nextNums.remove(i);
            primes.addAll(getPrimes(nextAcc, nextNums));
        }
        return primes;
    }

    public int solution(String numbers) {
        List<Integer> nums = numbers.chars()
                .map(c -> c - '0')
                .boxed()
                .collect(Collectors.toList());
        Set<Integer> primes = new HashSet<>();
        return getPrimes(0, nums).size();
    }

}

