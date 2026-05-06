class Solution {
    public boolean checkInclusion(String s1, String s2) {
    Map<Character, Integer> map1 = new HashMap<>();

    if (s1.length() > s2.length()) {
        return false;
    }

    for (char c : s1.toCharArray()) {
        map1.put(c, map1.getOrDefault(c, 0) + 1);
    }

    int l = 0, r = 0, n = s2.length();
    Map<Character, Integer> map2 = new HashMap<>();

    while (r < n) {
        char c = s2.charAt(r);

        while (l <= r && !map1.containsKey(c)) {
            char leftChar = s2.charAt(l);
            if (map2.containsKey(leftChar)) {
                map2.put(leftChar, map2.get(leftChar) - 1);
                if (map2.get(leftChar) == 0) {
                    map2.remove(leftChar);
                }
            }
            l++;
        }

        if (l > r) {
            r = l;
            continue;
        }

        map2.put(c, map2.getOrDefault(c, 0) + 1);

        while (map2.get(c) > map1.get(c)) {
            char leftChar = s2.charAt(l); // not r
            map2.put(leftChar, map2.get(leftChar) - 1);
            if (map2.get(leftChar) == 0) {
                map2.remove(leftChar);
            }
            l++;
        }

        if (r - l + 1 == s1.length()) {
            return true;
        }

        r++;
    }

    return false;
}
}
