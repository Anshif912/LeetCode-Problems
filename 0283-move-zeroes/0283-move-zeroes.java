class Solution {
    public void moveZeroes(int[] nums) {

        int zero=0;
        int num=0;

        for(int i:nums){
            if(i!=0){
                nums[num++]=i;
            }
        }
        while(num<nums.length){
            nums[num++]=0;
        }
        
    }
}