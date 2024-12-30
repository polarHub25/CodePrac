import java.util.LinkedList;
import java.util.Queue;

/**
 * 시간복잡도 : O(n*m) 
 * 공간복잡도 : O(n*m)
 */

public class LeetCode_994 {
    public static void main(String[] args){
        
        LeetCode_994 sol = new LeetCode_994();
        
        int[][] input = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println("result : " + sol.orangesRotting(input));

    }

    public int orangesRotting(int[][] grid) {

        int rows = grid.length; 
        int cols = grid[0].length; 
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshCount++; 
                }
            }
        }

        if (freshCount == 0) return 0;

        int minutes = 0; // 경과 시간
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // 상하좌우 방향

       
        while (!queue.isEmpty() && freshCount > 0) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];

                for (int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];

                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2; 
                        queue.add(new int[]{newRow, newCol}); 
                        freshCount--;
                    }
                }
            }
            minutes++;
        }

        return freshCount == 0 ? minutes : -1;     
    }
}
