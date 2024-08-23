package algorithmPrac.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol0819 {

// 답안 : https://github.com/gilbutITbook/080337/tree/main/3%EC%9E%A5

    private static class Point {
        public final long x, y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    /**
     * 교점 찾기 메소드
     */
    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {

        double x = (double) ((b1 * c2) - (b2 * c1)) / ((a1 * b2) - (a2 * b1));
        double y = (double) ((a2 * c1) - (a1 * c2)) / ((a1 * b2) - (a2 * b1));

        if (x % 1 != 0 || y % 1 != 0) {
            return null;
        }
        return new Point((long) x, (long) y);
    }

    /**
     * 최대값 구하기 매소드
     */
    public Point maxPoint(List<Point> points) {
        long maxX = Long.MIN_VALUE;
        long maxY = Long.MIN_VALUE;

        for (Point point : points) {
            if (point.x > maxX) maxX = point.x;
            if (point.y > maxY) maxY = point.y;
        }

        return new Point(maxX, maxY);
    }

    /**
     * 최소값 구하기 매소드
     */
    private Point minPoint(List<Point> points) {
        long minX = Long.MAX_VALUE;
        long minY = Long.MAX_VALUE;

        for (Point point : points) {
            if (point.x < minX) minX = point.x;
            if (point.y < minY) minY = point.y;
        }
        return new Point(minX, minY);
    }

    /**
     * 답안 도출
     */
    public String[] Solution(int[][] line) {

        List<Point> points = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);
                if (intersection != null) points.add(intersection);
            }
        }

        int width = (int) (maxPoint(points).x - minPoint(points).x + 1);
        int height = (int) (maxPoint(points).y - minPoint(points).y + 1);

        char[][] charArr = new char[height][width];
        for (char[] rows : charArr) {
            Arrays.fill(rows, '.');
        }

        for (Point point : points) {
            int x = (int) (point.x - minPoint(points).x);
            int y = (int) (maxPoint(points).y - point.y);
            charArr[y][x] = '*';
        }
        /**
         * /* 설명
         *         1. x 좌표 변환
         *         ㅁ 이 부분은 실제 좌표계의 점들을 2D 문자 배열에 매핑하는 과정입니다. 이렇게 구현하는 이유는 다음과 같습니다:
         *          ㅇ int x = (int) (point.x - minPoint(points).x);
         *           - 이는 모든 x 좌표를 양수로 만들고, 가장 왼쪽 점을 0으로 만듭니다.
         *           - 예를 들어, x 좌표가 -3에서 5 사이라면, -3을 0으로, 5를 8로 변환합니다.
         *
         *         2. y좌표 변환
         *         int y = (int) (maxPoint(points).y - point.y);
         *          - 이는 y 축을 뒤집습니다. 수학적 좌표계에서는 y가 위로 갈수록 커지지만,
         *          - 2D 배열에서는 인덱스가 아래로 갈수록 커집니다.
         *          - 또한 모든 y 좌표를 양수로 만들고, 가장 위쪽 점을 0으로 만듭니다.
         *
         *         3. 요약
         *         (좌표계 원점 이동) 실제 좌표는 음수일 수 있지만, 배열 인덱스는 항상 0 이상이어야 합니다.
         *         (y축 뒤집기) 수학적 좌표계와 2D 배열의 y축 방향이 반대이므로 이를 조정합니다.
         *         (공간 최소화) 점들이 존재하는 최소 영역만 표현하여 불필요한 공백을 줄입니다.
         *
         *         이렇게 함으로써 실제 수학적 좌표를 효율적으로 2D 문자 배열로 변환하여 표현할 수 있습니다.
         */
        
        String[] result = new String[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            result[i] = new String(charArr[i]);
        }

        return result;
    }

}
