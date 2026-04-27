class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        return solution02(nums);
    }

    public List<List<Integer>> solution01(int[] sum){
        Arrays.sort(sum);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<sum.length;i++){
            for(int j=i+1;j<=sum.length;j++){
                for(int k=j+1;k<sum.length;k++){
                    if(sum[i]+sum[j]+sum[k]==0){
                        set.add(Arrays.asList(sum[i],sum[j],sum[k]));
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
    public List<List<Integer>> solution02(int[] sum){
        Arrays.sort(sum);
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<sum.length;i++){
            if(i>0 && sum[i]==sum[i-1]){
                continue;
            }
            int l = i+1, r = sum.length-1;
            while(l<r){
                int tot = sum[i]+sum[l]+sum[r];
                if(tot<0){
                    l++;
                }else if(tot>0){
                    r--;
                }else{
                    list.add(Arrays.asList(sum[i],sum[l],sum[r]));
                    l++;
                    r--;
                    while(l<r && sum[l]==sum[l-1]){
                        l++;
                    }
                }
            }
        }
        return list;
    }
}
