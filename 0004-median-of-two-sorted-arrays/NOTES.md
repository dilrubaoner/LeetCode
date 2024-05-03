​Solution solution = new Solution 
newden sonra sınıf adı yazılır.

Array birleştirme
int [] nums = new int [nums1.length + nums2.length]; //dizinin boyutu
        for(int i = 0; i<nums1.length ; i++)
        {
            nums[i] = nums1[i];
        }
          for(int i = 0; i<nums2.length ; i++)
        {
            nums[i + nums1.length] = nums2[i];
        }

Array sıralarken Arrays (ssssss)
import java.util.Arrays;
 Arrays.sort(nums);
 
Koşul ifadesinde bu olasılığı unutma
       if (nums.length == 0) 
       {
        return Double.NaN; //bunu da araştır.
