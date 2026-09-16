class Solution {
    public int maxArea(int[] height) {
        int maxarea=0;
        int left=0;
        int right=height.length-1;

        while(left<right){
            int wid=right-left;
            int h=Math.min(height[left],height[right]);

            int curr=wid*h;
            maxarea=Math.max(maxarea,curr);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        

        return maxarea;
    }
}