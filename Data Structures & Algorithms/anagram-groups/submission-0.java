class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String temp = new String(c);
            map.putIfAbsent(temp,new ArrayList<>());
            map.get(temp).add(s);
        }
        return new ArrayList<>(map.values());
    }

}
