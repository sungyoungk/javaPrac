package algorithmPrac.array.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String[] solution(int[][] line) {

        List<Point> list = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);

                if (intersection != null) list.add(intersection);
            }
        }

        Point max = getMax(list);
        Point min = getMin(list);

        int width  = (int)(max.x - min.x + 1);
        int height = (int)(max.x - min.x + 1);

        char[][] arr = new char[height][width];
        for (char[] chars : arr) {
            Arrays.fill(chars, '.');
        }

        for (Point p : list) {
            int x = (int)(p.x - min.x);
            int y = (int)(max.y - p.y);
            arr[y][x] = '*';
        }

        String[] result = new String[arr.length];
        for ( int i = 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }

        return result;
    }

    private static class Point {
        private final long x;
        private final long y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    Point intersection(long a, long b, long e,
                       long c, long d, long f) {

        double x = (double) ((b * f - e * d) / (a * d - b * c));
        double y = (double) ((e * c - a * f) / (a * d - b * c));

        if (x % 1 != 0 && y % 1 != 0) {
            return null;
        }

        return new Point((long) x, (long) y);
    }

    Point getMax(List<Point> list) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        for (Point p : list) {
            if (p.x > x) x = p.x;
            if (p.y > y) y = p.y;
        }
        return new Point(x, y);
    }

    Point getMin(List<Point> list) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point p : list) {
            if (p.x < x) x = p.x;
            if (p.y < y) y = p.y;

        }
        return new Point(x, y);
    }
}

