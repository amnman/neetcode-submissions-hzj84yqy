class Solution {
    public boolean isAnagram(String s, String t) {
        return solution02(s,t);
    }
    boolean solution01(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        Map<String,Long> map1 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(i->i,Collectors.counting()));
        Map<String,Long> map2 = Arrays.stream(t.split("")).collect(Collectors.groupingBy(i->i,Collectors.counting()));
        
        return map1.equals(map2);
    }
    boolean solution02(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
