package algorithmPrac.exhaustiveSearch.badUser;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/***
 * @불량유저 level3 p.224
 * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/64064
 */
public class BadUser3 {

    // apple
    // appl*

    /**
     *   1. 단어 길이가 같다? 검사해보자
     *   2. 단어끼리 일치 하고 그 count 가 length -1
     *
     String[][] bans = Arrays.stream(banned_id)
     .map(banned -> banned.replace('*', '.'))  // '*'를 '.'로 바꿔서 정규 표현식으로 변환
     .map(banned -> Arrays.stream(user_id)      // 각 banned_id에 대해 user_id 배열을 스트림으로 변환
     .filter(id -> id.matches(banned))  // banned 패턴과 일치하는 user_id 필터링
     .toArray(String[]::new))  // 필터링된 user_id를 String[]로 수집
     .toArray(String[][]::new);  // 각 배열을 2차원 배열로 수집

     */



    private void count(int index, String[][] bans, Set<Set<String>> banSet, Set<String> banned ) {

        if (index == bans.length) {
            banSet.add(new HashSet<>(banned));

            return;
        }

        for(String id : bans[index]) {
            if(banned.contains(id)) continue;
            banned.add(id);
            count(index + 1, bans, banSet, banned);
            banned.remove(id);
        }
    }

    public int solution(String[] user_id, String[] banned_id) {
    String[][] bans = Arrays.stream(banned_id)
            .map(ban -> ban.replace('*', '.'))
            .map(ban -> Arrays.stream(user_id)
                            .filter(id -> id.matches(ban))
                            .toArray(String[]::new))
            .toArray(String[][]::new);

        HashSet<Set<String>> banSet = new HashSet<>();
        count(0, bans, banSet, new HashSet<>());

        return banSet.size();
    }
}
