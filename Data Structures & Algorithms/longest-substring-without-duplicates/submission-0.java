class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0;
        int maxCount=0,n=s.length();
        Map<Character,Integer> map = new HashMap<>();
        while(r<n){
            if(map.containsKey(s.charAt(r))){
                l=Math.max(map.get(s.charAt(r))+1,l);
            }
            map.put(s.charAt(r),r);
            maxCount=Math.max(maxCount,r-l+1);
            r++;
        }
        return maxCount;
    }
}
