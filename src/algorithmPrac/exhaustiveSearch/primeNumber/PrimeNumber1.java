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
public class PrimeNumber1 {


    // 소수 : 1보다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수
    private boolean isPrime(int n) {
    if ( n <= 1) return false;

    for ( int i = 2; i * i <= n; i++) {
        if(n % i == 0) return false;
    }
    return true;
    }


                                                            // 17
    private Set<Integer> getPrimes(int acc, List<Integer> numbers) {
        Set<Integer> primes = new HashSet<>();
        if (isPrime(acc)) primes.add(acc);

        for (int i = 0; i < numbers.size(); i++) {
            int nextAcc = acc * 10 + numbers.get(i);
            List<Integer> nextNumbers = new ArrayList<>(numbers);

            nextNumbers.remove(i);
            primes.addAll(getPrimes(nextAcc, nextNumbers));
        }

        return primes;
    }

    public int solution(String nums) {
        List<Integer> numbers = nums.chars()
                .map(c -> c - '0')
                .boxed()
                .collect(Collectors.toList());

        return getPrimes(0, numbers).size();
    }

}
