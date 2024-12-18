
import java.util.Arrays;
import java.util.HashMap;

class TwoSum_01 {
    
    public static void main(String args[]){
        
        //https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=ar244hmv

        TwoSum_01 sol = new TwoSum_01();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = sol.twoSum(nums, target);
        System.out.println("result ::" + Arrays.toString(result));        
    }

    public int[] twoSum(int[] nums, int target) {

        // 시간복잡도 : O(n^2) 공간복잡도 : O(1) => 확장성을 위해 map을 사용하는게 좋음
        int[] result = new int[2]; 
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;

                    return result;
                }
            }
        }

        throw new IllegalArgumentException("No solution");
    }

    public int[] twoSumOther(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
        
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No solution found");
    }

}
