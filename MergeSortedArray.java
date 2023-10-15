import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
        Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        Output: [1,2,2,3,5,6]
        */

        // 2개 배열 합치기. 0제외하고 
        // m,n 값이 0이상일떄 합칠수있고, 
        
        int index = 0;
        for(int i = m; i < m+n; i++){
            nums1[i] = nums2[index++];
        }

        Arrays.sort(nums1);

        for(int j = 0; j < nums1.length; j++){
            System.out.println(nums1[j]);
        }

    }
}
