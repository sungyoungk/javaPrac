package algorithmPrac.string.UpperLowerReplace;

public class UpperLower {
    /** @문자열_내_P와_Y의_개수(level1) p.137
     *  @URL: https://programmers.co.kr/learn/courses/30/lessons/12916
     *
     */

//    대문자와 소문자가 섞여 있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교하여 같으면 true,
//    다르면 false 를 return 하는 solution 함수를 완성해주세요.
//
//    'p' 'y' 모두 하나도 없을 때는 항상 true 를 리턴 합니다. 단 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
//
//     예를 들어 s가 "pPoooyY" 면 true 를 return 하고 "Pyy"라면 false 를 return 합니다.

    public boolean solution(String s) {
        String str = s.toUpperCase();
        int p = 0;
        int y = 0;

        for(char c : str.toCharArray()) {
            if (c == 'P') {
                p++;
            } else if (c == 'Y') {
                y++;
            }
        }

        if (p == 0 && y ==0) return true;

        if (p == y) return true;

        return false;
    }


}
