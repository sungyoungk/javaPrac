package algorithmPrac.recursion;

public class QuadCompression5 {
    /**
     * @쿼드압축_후_개수_세기_level2 (p.160)
     * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/68936
     */

    private static class Count{
        public int zero;
        public int one;

        public Count(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }

        public Count add(Count other) {
            return new Count(this.zero + other.zero, this.one + other.one);
        }
    }

    /**
     @상태 (offsetX, offsetY, size)
     @종료조건 {1:0, 0:1} , {0:1, 1:0}
     @점화식 (offsetX, offetY, size) =  (offsetX      , offsetY     , size/2)
                                     + (offsetX + h , offsetY     , size/2)
                                     + (offsetX     , offsetY + h , size/2)
                                     + (offsetX + h , offsetY + h , size/2)


     */

    private Count count(int offsetX, int offsetY, int size, int[][] arr) {
        int h = size / 2;

        for (int x = offsetX; x < offsetX + size; x ++) {
            for ( int y = offsetY; y < offsetY + size; y ++) {
                if (arr[offsetY][offsetX] != arr[y][x]) {
                    return count(offsetX, offsetY, h, arr)
                            .add(count(offsetX + h, offsetY, h, arr))
                            .add(count(offsetX, offsetY + h, h, arr))
                            .add(count(offsetX + h, offsetY + h, h, arr));
                }
            }
        }

        if (arr[offsetY][offsetX] == 1) {
            return new Count(0, 1);
        }

        return new Count(1, 0);
    }

   public int[] solution(int[][] arr) {
        Count count = count(0, 0, arr.length, arr);
       return new int[]{count.zero, count.one};
   }
}
