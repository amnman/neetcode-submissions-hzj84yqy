class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length-k+1];
        int l=0,r=0,n=nums.length;
        while(l<n-k+1){
            int max=Integer.MIN_VALUE;
            while((r-l)<k){
                if(nums[r]>max){
                    max=nums[r];
                }
                r++;
            }
            res[l]=max;
            l++;
            r=l;
        }
        return res;
    }
    public int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int a:arr){
            if(max<a){
                max=a;
            }
        }
        return max;
    }
}
