import java.util.Arrays;

public class ThirdMax {
    
 public int thirdMax(int[] nums) {

        // 배열 정렬 
        // 중복을 제거하면 무조건 3번째 크기의 숫자 반환.. 세상에나.. 
        // 근데 3번쨰보다 작으면..? 
        // 이 문제의 핵심은 중복을 제거하냐 안하냐의 차이인듯. 
        Arrays.sort(nums);

        int prev = nums[0];
        int index = 1;
        for (int i=1; i<nums.length; i++) {
            if (prev == nums[i]) {
                continue;
            }
            prev = nums[i];
            nums[index++] = nums[i]; 
        }

        if (index < 3) {
            return nums[index-1];
        }
        return nums[index-3];


    }
}