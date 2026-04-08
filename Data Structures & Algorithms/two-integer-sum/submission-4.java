class Solution {
    public int[] twoSum(int[] nums, int target) {
        return solution02(nums,target);
    }
    int[] solution01(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[2];
    }
    int[] solution02(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff) && map.get(diff)!=i){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[2];
    }
}
