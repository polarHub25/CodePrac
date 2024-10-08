package ArrayPrac;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array01{

    private static class Point{

        public final long x, y;

        private Point(long x, long y){
            this.x = x;
            this.y = y;
        }
    }

    private Point intersection(long a1, long b1, long c1,long a2, long b2, long c2 ){
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2* b1 );

        if( x % 1 != 0 || y % 1 != 0 ) return null;

        return new Point((long) x , (long) y);
    }

    private Point getMininumPoint(List<Point> points) {

        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for(Point p : points){
            if(p.x < x) x = p.x;
            if(p.y < y) y = p.y;
        }
        
        return new Point(x, y);
    }

    private Point getMaxinumPoint(List<Point> points) {

        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for(Point p : points){
            if(p.x > x) x = p.x;
            if(p.y > y) y = p.y;
        }
        
        return new Point(x, y);
    }

    public String[] solution(int[][] line){

        List<Point> points = new ArrayList<>();
        for(int i =0; i < line.length; i ++){
            for(int j = i+1; j < line.length; j++){
                
                Point intersection = intersection(line[i][0], line[i][1], line[i][2], line[j][0], line[j][1], line[j][2]);

                if(intersection != null){
                    points.add(intersection);
                }
            }
        }

        Point min = getMininumPoint(points);
        Point max = getMaxinumPoint(points);

        int width = (int) (max.x - min.x + 1);
        int height = (int) (max.y - min.y + 1);

        char[][] arr = new char[height][width];
        for(char[] row : arr){
            Arrays.fill(row, '.');
        }

        for(Point p : points){
            int x = (int) (p.x - min.x);
            int y = (int) (max.y - p.y);
            arr[y][x] = '*';
        }

        String[] result = new String[arr.length];

        for(int i = 0; i < result.length; i++){
            result[i] = new String(arr[i]);
        }

        return result;
    }
    public static void main(String[] args){

        int[][] line = {
            {2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}
        };

        Array01 instance = new Array01();
        String[] result = instance.solution(line);

        for(String lineOutput : result){
            System.out.println(lineOutput);
        }
    }

}
