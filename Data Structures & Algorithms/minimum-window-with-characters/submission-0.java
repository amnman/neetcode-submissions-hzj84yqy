class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>(); 
        for(char c : t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }       
        int l=0,r=0,n=s.length(),have=0,need=map2.size();
        int resLength=Integer.MAX_VALUE;
        int[] res = new int[2];
        while(r<n){
            char c = s.charAt(r);
            map1.put(c,map1.getOrDefault(c,0)+1);
            if(map2.containsKey(c) && map1.get(c).equals(map2.get(c))){
                have++;
            }
            while(have==need){
                if((r-l+1)<resLength){
                    resLength = r-l+1;
                    res[0]=l;
                    res[1]=r;
                }
                char leftChar = s.charAt(l);
                map1.put(leftChar,map1.get(leftChar)-1);
                if(map2.containsKey(leftChar) && map1.get(leftChar) < map2.get(leftChar)){
                    have--;
                }
                l++;
            }
            r++;
        }
        return resLength==Integer.MAX_VALUE ? "" : s.substring(res[0],res[1]+1);
    }
}
