class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(0,1);

        int curr=0;
        int c=0;

        for(int num:nums){
            curr+=num;

            if(map.containsKey(curr-k)){
                c+=map.get(curr-k);
            }

            map.put(curr,map.getOrDefault(curr,0)+1);
        }

        return c;
        
    }
}