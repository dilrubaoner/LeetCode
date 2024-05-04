class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int start = 0;
        int end = height.length-1;

        while(start < end)
        {
            if(height[start]< height[end])
            {
                maxArea = Math.max(maxArea,height[start]*(end-start));
                start +=1;
            }
            else
            {
                maxArea = Math.max(maxArea, height[end]*(end-start));
                end -=1;
            }
        }
        return maxArea;


    }
}