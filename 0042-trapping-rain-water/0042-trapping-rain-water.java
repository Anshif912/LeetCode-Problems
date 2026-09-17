class Solution {
    public int trap(int[] height) {

        int res=0;
        int n=height.length;

            int[] left=new int[n+1];
            int[] right=new int[n+1];

            left[0]=height[0];
            for(int j=1;j<n;j++){
                left[j]=Math.max(left[j-1],height[j]);
            }

            right[n-1]=height[n-1];
            for(int j=n-2;j>=0;j--){
                right[j]=Math.max(right[j+1],height[j]);
            }

            for(int j=0;j<n;j++){
                res+=Math.min(left[j],right[j])-height[j];
            }


        return res;
        
    }
}