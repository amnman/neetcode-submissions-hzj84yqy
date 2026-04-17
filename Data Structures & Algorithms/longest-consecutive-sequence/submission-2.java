class Solution {
    public int longestConsecutive(int[] nums) {
        return solution02(nums);
    }
    public int solution01(int[] nums){
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
    public int solution02(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int res = 0;
        for(int i : set){
            int count=1;
            if(!set.contains(i-1)){
                while(set.contains(i+1)){
                    count++;
                    i++;
                }
            }
            res = Math.max(res,count);
        }
        return res;
    }
}
