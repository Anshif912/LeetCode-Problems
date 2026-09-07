class Solution {
    public String longestPalindrome(String s) {
        String longest="";
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub=s.substring(i,j+1);

                if(isPal(sub)&& sub.length()>longest.length()){
                    longest=sub;
                }
            }
        }

        return longest;
        
    }

    private boolean isPal(String str){
        int left=0;
        int right=str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            right--;
            left++;
        }

        return true;
    }
}