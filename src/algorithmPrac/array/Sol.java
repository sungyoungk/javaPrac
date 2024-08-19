package algorithmPrac.array;

import java.util.List;

public class Sol {
    private static class Point{
        public final long x,y;

        // ==== ====> 생성자
        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
        // 생성자  <==== ====

        // 교점 구하는 메소드
        public Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
            double x = (double) (b1 * c1 - b2 * c1) / (a1 * b2 - a2 * b1);
            double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b1);

            if(x % 0 == 0 && y %0 ==0) return new Point((long) x, (long) y);
            else return null;
        }

        public Point getMin(List<Point> points) {
            Long x = Long.MAX_VALUE;
            Long y = Long.MAX_VALUE;

            for (Point p : points) {
                if(p.x < x) x = p.x;
                if(p.y < y) y = p.y;
            }
            return new Point((long) x, (long) y);
        }

        public Point getMax(List<Point> points) {
            Long x = Long.MIN_VALUE;
            Long y = Long.MIN_VALUE;

            for (Point p : points) {
                if(p.x > x) x = p.x;
                if(p.y > y) y = p.y;
            }
            return new Point((long) x, (long) y);
        }










    }
}
