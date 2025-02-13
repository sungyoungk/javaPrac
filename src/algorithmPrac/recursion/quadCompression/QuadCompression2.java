package algorithmPrac.recursion.quadCompression;

public class QuadCompression2 {
    /**
     * @쿼드압축_후_개수_세기_level2 (p.160)
     * @URL: https://school.programmers.co.kr/learn/courses/30/lessons/68936
     */


    // 0과 1 로 구성된 2nx2n 크기의 2차원 정수 배열 arr이 있습니다. 당신은 이 arr을 쿼드 트리와 같은 방식으로
    // 압축하고자 합니다. 구체적인 방식은 다음과 같습니다.
    //  1. 당신이 압축하고자 하는 특정 영역을 S라고 정의합니다.
    //  2. 만약 S 내부에 있는 모든 수가 같은 값이라면, s를 해당 수 하나로 압축시킵니다.
    //  3. 그렇지 않다면 S를 정확히 네 개의 균일한 정사각형 영역（입출력 예 참고）으로 쪼갠 후 각 정사각형 영역
    //     에 대해 같은 방식의 압축을 시도합니다.
    //
    // arr이 매개변수로 주어집니다. 이런 방식으로 arr을 압축했을 때, 배열에 최종적으로 남는 0의 개수와 1의 개
    //수를 배열에 담아 return하도록 solution 함수를 완성해주세요.
    //
    // 제한사항
    //• arr의 행 개수는 1 이상 1024 이하이며, 2의 거듭 제곱수 형태를 띱니다. 즉, arr°l 행 개수는 1, 2,4, 8,..,
    //  1024 중하나입니다.
    //- arr의 각 행 길이는 arr의 행 개수와 같습니다. 즉, arr은 정사각형 배열입니다.
    //- arr의각행에있는모든값은0또는1입니다.

    // [입출력 예시]
    // arr    : [[1,1,0,0],
    //           [1,0,0,0],
    //           [1,0,0,1],
    //           [1,1,1,1]]
    // result : [4,9]

    // 0 과 1의 개수를 한 번에 담을 수 있는 클래스 생성
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
        for (int x = offsetX; x < offsetX + size; x++) {
            for (int y = offsetY; y < offsetY + size; y++) {
                int h = size / 2;
                if (arr[y][x] != arr[offsetY][offsetX]) {
                    return count(offsetX, offsetY, h, arr)
                            .add(count(offsetX + h, offsetY, h, arr))
                            .add(count(offsetX, offsetY + h, h, arr))
                            .add(count(offsetX + h, offsetY + h, h, arr));
                }
            }
        }
        if (arr[offsetY][offsetX] == 1) {
            return new Count(0, 1);
        } else {
            return new Count(1, 0);
        }
    }

    public int[] solution(int[][] arr) {
        Count count = count(0, 0, arr.length, arr);
        return new int[]{count.zero, count.one};
    }
}
