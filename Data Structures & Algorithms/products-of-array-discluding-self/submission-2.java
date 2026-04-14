class Solution {
    public int[] productExceptSelf(int[] nums) {
        return solution02(nums);
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
    public int[] solution02(int[] nums){
        int[] res = new int[nums.length];
        res[0]=1;
        //finding prefix
        for(int i = 1;i<nums.length;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int n = nums.length;
        //finding suffix
        int suffix=1;
        for(int i = n-1; i>=0; i--){
            res[i]*=suffix;
            suffix*=nums[i];
        }
        return res;
    }

}  
