class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                return true;
            }
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return false;
    }
}