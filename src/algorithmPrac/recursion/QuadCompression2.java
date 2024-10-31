package algorithmPrac.recursion;

public class QuadCompression2 {
    /**
     * @쿼드압축_후_개수_세기_level2 (p.160)
     * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/68936
     */

    private static class Count{
        public final int zero;
        public final int one;

        Count(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }

        public Count add(Count other) {
            return new Count(zero + other.zero, one + other.one);
        }


    }

    /***
     *
     * @상태(offsetX,offsetY,length)
     * offsetX, Y에서 시작, 가로/세로 길이가 length인 정사각형을 압축했을대 남아 있는 0과 1의 개수
     *
     * @종료조건
     * 범위 안의 원소가 모두 0 또는 1일때
     * {0:1, 1:0} -> 모든 원소가 0 또는 {1:0,0:1} -> 모든 원소가 1
     *
     * @점화식
     *
     *
     */

    // 재귀 정의의 작은 단위를 해결 할 수 있는 매서드
    private Count count(int offsetX, int offsetY, int size, int[][]arr) {
        int h = size / 2;
        for (int x = offsetX; x < offsetX + size; x++) {
            for ( int y = offsetY; y < offsetY + size; y++) {
                if(arr[y][x] != arr[offsetY][offsetX]) {
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
        return new Count(1, 0);
    }


   public int[] solution(int[][] arr) {
        Count count = count(0,0, arr.length, arr);
       return new int[]{count.zero, count.one};
   }



}
