import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {

        /**
         * heights:  [1,1,4,2,1,3]
           expected: [1,1,1,2,3,4]
         */

        int[] sortHeights = new int[heights.length];

        int flag = 0;

        for(int i = 0; i < heights.length; i++){
            sortHeights[i] = heights[i];
        }

        Arrays.sort(heights);    

        for(int i = 0; i < heights.length; i ++){
            if(heights[i] != sortHeights[i]){
                flag++;
            }
        }
        
        return flag;
    }
}
