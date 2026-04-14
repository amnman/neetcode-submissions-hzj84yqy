class Solution {
    public int[] productExceptSelf(int[] nums) {
        return solution01(nums);
    }

    public int[] solution01(int[] nums){
        int[] res = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            int prod=1;
            for(int j = 0; j<nums.length; j++){
                if(i==j){
                    continue;
                }
                prod*=nums[j];
            }
            res[i]=prod;
        }
        return res;
    }
}  
