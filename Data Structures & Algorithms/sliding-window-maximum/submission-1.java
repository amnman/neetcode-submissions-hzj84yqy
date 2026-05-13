class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l=0,r=0,n=nums.length;
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[n-k+1];
        while(r<n){
            while(!deque.isEmpty() && nums[deque.getLast()]<nums[r]){
                deque.removeLast();
            }
            deque.addLast(r);
            if(l>deque.getFirst()){
                deque.removeFirst();
            }
            if((r+1)>=k){
                res[l]=nums[deque.getFirst()];
                l++;
            }
            r++;
        }
        return res;
    }
}
