class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set = new LinkedHashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int res = 0;
        for(int i : set){
            int n = i;
            int count=0;
            while(set.contains(n)){
                n++;
                count++;
            }
            res = Math.max(res,count);
        }
        return res;
    }
}
