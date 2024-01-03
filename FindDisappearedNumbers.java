import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        //int[] nums = {4,3,2,7,8,2,3,1}; => 5,6 
        //int[] nums = {1,1} => 2 
        
       Arrays.sort(nums); // 1,2,3,4,7,8
       for(int i =0; i<nums.length; i++){
            System.out.println(nums[i]) ;
       }
       
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1) { 
                if(Arrays.binarySearch(nums, i+1) < 0) { 
                    //Arrays.binarySearch(이진탐색을 당할 배열, 찾는 값);
                    list.add(i+1);
                }
            }
            System.out.println(list);
        }

        return list;
        
    }
    
}
