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

    private Point getMaxPoint(List<Point> points) {
        long x = Long.MIN_VALUE ;
        long y = Long.MIN_VALUE ;
        for(Point p : points) {
           if(p.x > x) x = p.x ;
           if(p.y > y) y = p.y ;
        }
        return new Point(x, y) ;
    }

    private Point getMinPoint(List<Point> points) {
        long x = Long.MAX_VALUE ;
        long y = Long.MAX_VALUE ;

        for(Point p : points) {
            if(p.x < x) x = p.x ;
            if(p.y < y) y = p.y ;
        }
        return new Point( x, y) ;
    }

    private Point intersection(long A, long B, long E, long C, long D, long F) {

        double x = (double) (B*F - E*D) / (A*D - B*C) ;
        double y = (double) (E*C - A*F) / (A*D - B*C) ;

        if(x % 1 != 0 || y % 1 != 0) return null;
        return new Point((long)x, (long)y);
    }

    public String[] solution(int[][] line) {
    List<Point> points = new ArrayList<>();
       for(int i = 0; i < line.length; i++) {
           for(int j = 0; j < line.length; j++) {
               Point intersection = intersection(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);
               if(intersection != null) {
                   points.add(intersection) ; // 교점들 좌표 모두 저장!
               }
           }
       }
       Point max = getMaxPoint(points) ;
       Point min = getMinPoint(points) ;

       int width  = (int) (max.x - min.x + 1) ; // 최대 최소
       int height = (int) (max.y - min.y + 1) ; //

        char[][] arr = new char[height][width] ;
        for(char[] c : arr) {
            Arrays.fill(c, '.') ;
        } // 모든 영역에 . 표시

        for ( int i = 0; i < points.size(); i ++) {
            int x = (int)(points.get(i).x - min.x) ;
            int y = (int)(max.y - points.get(i).y) ;
            arr[y][x] = '*' ;
        }

        String[] result = new String[arr.length] ;
        for( int i = 0; i < result.length; i ++) {
            result[i] = new String(arr[i]) ;
        }
        return result ;
    }
}
