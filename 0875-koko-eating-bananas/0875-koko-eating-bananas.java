
class Solution {
    public boolean check(int mid,int[] piles,int hours){

        long count=0;
        for(int a:piles){
            count+=(a/mid);
            if(a%mid!=0){
                count++;
            }
        }
        return count<=hours;

        
    }


    public int minEatingSpeed(int[] piles, int h) {

        int low=1;
        int high = piles[0]; for(int n : piles) high = Math.max(high, n);
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(mid,piles,h)){
                ans=mid;
                high=mid-1;
                
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}