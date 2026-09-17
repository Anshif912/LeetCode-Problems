class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> ans=new HashSet<>();
        for(int num:nums){
            ans.add(num);

        }
        int count=0;

        for(int num:ans){
            int c=0;
            if(!ans.contains(num-1)){
                int first=num;
                c++;
                while(ans.contains(first+1)){
                    c++;
                    first++;
                }
            }

            count=Math.max(c,count);
        }


        return count;



    }
}