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

        String[] result = new String[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            result[i] = new String(charArr[i]);
        }

        return result;
    }

}
