class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new TreeMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            list.add(e);
        }
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i).getKey();
        }

        return res;
    }
}
