package algorithmPrac.array.makeStar;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @제목: 교점에_별_만들기 level_2 p.60
 * @URL: https://programmers.co.kr/learn/courses/30/lessons/87377
 */
public class Solutio2 {

    private static class Point{
        public final long x,y;

        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    private Point intersection(long A, long B, long E, long C, long D, long F ) {
        double x = (double) (B*F - E*D) / (A*D - B*C);
        double y = (double) (E*C - A*F) / (A*D - B*C);

        if(x % 1 != 0 || y % 1 != 0) return null;
        return new Point((long)x, (long)y);
    }

    private Point max(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for(Point p : points) {
            if(p.x > x) x = p.x;
            if(p.y > y) y = p.y;
        }
        return new Point(x, y);
    }

    private Point min(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for(Point p : points) {
            if(p.x < x) x = p.x;
            if(p.y < y) y = p.y;
        }
        return new Point(x, y);
    }

    public String[] solution(int[][] line) {

        List<Point> points = new ArrayList<>();
        for(int i = 0; i < line.length; i++) {
            for(int j = 0; j < line.length; j++) {
                Point intersection = intersection(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);
                if(intersection != null) points.add(intersection);
            }
        }

        Point max = max(points);
        Point min = min(points);

        int width  = (int)(max.x - min.x + 1);
        int height = (int)(max.y - min.y + 1);

        char[][] arr = new char[height][width];
        for(char[] c : arr) {
        Arrays.fill(c, '.');
        }

        for(Point p : points) {
            int x = (int) (p.x - min.x);
            int y = (int) (max.y - p.y);
            arr[y][x] = '*';
        }

        String[] result = new String[arr.length];
       for(int i = 0; i < result.length; i ++) {
           result[i] = new String(arr[i]);
       }
       return result;
    }
}
