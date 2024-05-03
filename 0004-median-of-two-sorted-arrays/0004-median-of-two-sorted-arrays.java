import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1,int[]nums2) {

        int [] nums = new int [nums1.length + nums2.length]; //dizinin boyutu
        for(int i = 0; i<nums1.length ; i++)
        {
            nums[i] = nums1[i];
        }
          for(int i = 0; i<nums2.length ; i++)
        {
            nums[i + nums1.length] = nums2[i];
        }

        Arrays.sort(nums);
       if (nums.length == 0) //bu olasılığı unutma
       {
        return Double.NaN;
       }
        else if(nums.length%2==1)
        {
            return nums[nums.length/2];
        }
        else //(nums.length%2==0)
        {
            int index = (nums.length)/2;
            return (nums[index-1]+ nums[index])/2.0;
            // return (double)(nums[index-1]+[index])/2; type casting
        }
    }

    public static void main (String args[])
    {
        Solution solution = new Solution(); //new Solution class adı
        int [] nums1 = {1,3};
        int [] nums2 = {2};

        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.print("Medyan: " + median);

    }
}