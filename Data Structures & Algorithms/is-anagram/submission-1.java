class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<String,Long> map1 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(i->i,Collectors.counting()));
        Map<String,Long> map2 = Arrays.stream(t.split("")).collect(Collectors.groupingBy(i->i,Collectors.counting()));
        
        return map1.equals(map2);
    }
}
