using System;

public class LeetCode_04
{
    public static void main(string[] args){
        LeetCode_04 sol = new LeetCode_04();
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        double result = sol.FindMedianSortedArrays(nums1, nums2);

        Console.WriteLine("result: " + result);
    }

    public double FindMedianSortedArrays(int[] nums1, int[] nums2){
        int[] nums3 = new int[nums1.Length + nums2.Length];
        
        Array.Copy(nums1, 0, nums3, 0, nums1.Length);
        Array.Copy(nums2, 0, nums3, nums1.Length, nums2.Length);

        Array.Sort(nums3);

        int len = nums3.Length;

        if(len % 2 == 0){
            return (nums3[len / 2-1] + nums3[len / 2]) / 2.0;
        }else{
            return nums3[len / 2];
        }
        
        
    }

}
