package algorithmPrac.array.array;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private java.util.Arrays Arrays;

    public String[] solution(int[][] line) {

        List<Point> points = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point intersection =
                        intersection(line[i][0], line[i][1], line[i][2],
                                line[j][0], line[j][1], line[j][2]);

                if (intersection != null) {
                    points.add(intersection);
                }
            }

        }

        Point max = max(points);
        Point min = min(points);

        int width = (int) (max.x - min.x);
        int height = (int) (max.y - min.y);

        char[][] arr = new char[height + 1][width + 1];
        for (char[] chars : arr) {
            Arrays.fill(chars, '.');
        }

        for (Point p : points) {
            int x = (int) (p.x - min.x);
            int y = (int) (max.y - p.y);

            arr[y][x] = '*';
        }

        String[] result = new String[arr.length];
        for(int i = 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }
        return result;
    }


    public static class Point {
        public final long x, y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    Point intersection(long a, long b, long e, long c, long d, long f) {

        if ((a*d - b*c)!= 0) {
            double x = ((double)(b*f - e*d) / (double)(a*d - b*c));
            double y = ((double)(e*c - a*f) / (double)(a*d - b*c));

            if (x % 1 != 0 || y % 1 != 0) return null;

            return new Point((long)x, (long)y);
        }

        return null;
    }

    Point max (List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for(Point p : points) {
            if (p.x > x) x = p.x;
            if (p.y > y) y = p.y;
        }
        return new Point(x, y);
    }

    Point min (List<Point>points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for(Point p : points) {
            if (p.x < x) x = p.x;
            if (p.y < y) y = p.y;
        }
        return new Point(x, y); }
    }






