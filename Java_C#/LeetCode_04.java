import java.util.Arrays;

/*
 *  System.arraycopy 
 * - 기존 배열에서 일부 데이터를 특정 위치에 복사해야할 때 
 * - 배열의 일부를 다른 배열에 병합하거나 교체
 * 
 *  Arrays.copyOf 
 * - 새로운 크기의 배열을 만들어야 할때 
 * - 배열의 요소를 전체 복사하고, 남은 공간은 기본값으로 채우고싶을때
 * 
 * 시간 복잡도 : O(n log n)
 * 공간 복잡도 : O(n)
 */

public class LeetCode_04 {

    public static void main(String argsp[]){

        LeetCode_04 sol = new LeetCode_04();
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double result = sol.findMedianSortedArrays(nums1, nums2);

        System.out.println("result : " + result);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] nums3 = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums3, 0, nums1.length);
        System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);
        Arrays.sort(nums3);

        int len = nums3.length;
        
        if(len % 2 == 0){
            return (nums3[len / 2-1] + nums3[len / 2]) / 2.0;
        
        }else{
           return nums3[len / 2];
        }
    }
}
