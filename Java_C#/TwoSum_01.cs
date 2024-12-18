
using System;
using System.Collections.Generic;

class TwoSum_01 {
    static void main(string[] args){
        TwoSum_01 sol = new TwoSum_01();

        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = sol.TwoSum(nums, target);
        Console.WriteLine("Result: [" + string.Join(", ", result) + "]");

    }

    public int[] TwoSum(int[] nums, int target){

        int[] result = new int[2];
        for(int i = 0; i< nums.Length - 1; i++){
            for(int j = i + 1; j < nums.Length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        throw new ArgumentException("No Solution");
    }

    public intp[] TwoSumOther(int[] nums, int target){
        Dictionary<int, int> map = new Dictionary<int, int>();

        for( int i = 0; i < nums.Length; i++){
            int complement = target - nums[i];
            
            if(map.ContainsKey(complement)){
                return new int[] { map[complement], i};
            }

            map[nums[i]] = i;
        }

        throw new ArgumentException("No solution");

    }

}
