package algorithmPrac.stringMethod.substring;

import java.util.ArrayList;
import java.util.List;

public class Compress3 {
/**
 * @문자열_압출_level2 p.120
 * @URL: https://programmers.co.kr/learn/courses/30/lessons/60057
 */
    //
    String str = "abccabac";


private List<String> split(String str, int length) {

    return new ArrayList<String>();
}

    private int compress(String str, int length) {

    StringBuilder builder = new StringBuilder();

    String last = "";
    int count = 0;

    for (String token : split(str, length)) {
        if (token.equals(last)) {
            count ++;
        } else {
            if ( count > 1) {
                builder.append(count);
                builder.append(token);
                count = 1;
            }
        }

        }
        return 0;
    }

   public int solution(String str) {

       int min = Integer.MAX_VALUE;

       for(int length = 1; length <= str.length(); length ++) {
           int compress = compress(str, length);
           if ( min > compress) {
               min = compress;
           }
       }
       return min;
   }

}
