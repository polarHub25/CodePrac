import java.util.Arrays;

public class SquaresSortedArray {

    /**
     * Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
        Explanation: After squaring, the array becomes [16,1,0,9,100].
        After sorting, it becomes [0,1,9,16,100].
        Example 2:

        Input: nums = [-7,-3,2,3,11]
        Output: [4,9,9,49,121]
     * 
     */

    public int[] sortedSquares(int[] nums) {
    
        //input값, 제곱한 값 
        int[] powArr = new int[nums.length];
        //결과값 
        //int[] result = new int[nums.length];

        //제곱근
        for(int i = 0; i< nums.length; i++){
            powArr[i] = (int) Math.pow(nums[i], 2);
            System.out.println(powArr[i]);
        }

        Arrays.sort(powArr);

            return Arrays.stream(nums)
                    .map(num -> num * num)
                    .sorted()
                    .toArray();


    }
}
