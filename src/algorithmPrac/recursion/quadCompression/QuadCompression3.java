package algorithmPrac.recursion.quadCompression;

public class QuadCompression3 {
    /**
     * @쿼드압축_후_개수_세기_level2 (p.160)
     * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/68936
     */


    /***
     * @상태 (offsetX, offsetY, size)
     * @종료조건 ( {0:1, 1:1}, {1:0, 0:1}
     * @점화식
     * (offsetX, offsetY, size) =   (offsetX, offsetY, size/2)
     *                            + (offsetX +size/2, offsetY, size/2)
     *                            + (offsetX, offsetY + size/2, size/2)
     *                            + (offsetX, + size/2, offsetY + size/2, size/2)
     */



    private static class Count {
        public final int zero;
        public final int one;

        public Count(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }

        public Count add(Count other) {
            return new Count(this.zero + other.zero, this.one + other.one);
        }
    }

    private Count count(int offsetX, int offsetY, int size, int[][]arr) {
        int h = size/2;
        for(int x = offsetX; x < offsetX + size; x++) {
            for(int y = offsetY; y < offsetY + size; y++) {
                if(arr[offsetY][offsetX] != arr[y][x]) {
                    return count(offsetX, offsetY, h, arr)
                            .add(count(offsetX + h, offsetY, h, arr))
                            .add(count(offsetX, offsetY + h, h, arr))
                            .add(count(offsetX + h, offsetY + h, h, arr));
                }
            }
        }
        if(arr[offsetY][offsetX] == 1) {
            return new Count(0, 1);
        }

        return new Count(1,0);
    }


   public int[] solution(int[][] arr) {
        Count count = count(0, 0, arr.length, arr);
       return new int[]{count.zero, count.one};
   }



}
