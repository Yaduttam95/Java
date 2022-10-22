class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";

        Map<Character, Integer>tar = new HashMap<>();
        for(char ch:t.toCharArray()) tar.put(ch, tar.getOrDefault(ch,0)+1);
        int strt = -1, end = -1;
        int i = 0;
        int size = Integer.MAX_VALUE;

        Map<Character, Integer>src = new HashMap<>();
        for(int j=0; j<s.length(); j++) {
            char ch = s.charAt(j);
            if(tar.containsKey(ch)) {
                src.put(ch, src.getOrDefault(ch, 0) + 1);
                if(src.size() == tar.size()) {
                    boolean bool = check(src, tar);
                    if(bool) {
                        while(true) {
                            char chr = s.charAt(i);
                            if(src.containsKey(chr)) {
                                src.put(chr, src.get(chr)-1);
                                if(tar.get(chr) > src.get(chr)) { i++; break; }
                                if(src.get(chr) == 0) src.remove(chr);
                            }
                            i++;
                        }
                        if(j-i+2 < size) { 
                            size = j - i + 2; 
                            strt = i-1; end = j; 
                        }
                    }
                }
            }
        }
        return end == -1? "" : s.substring(Math.max(0,strt), end+1);
    }

    public boolean check(Map<Character, Integer>src, Map<Character, Integer>tar) {
        for(char ch:src.keySet()) if(tar.get(ch) > src.get(ch)) return false;
        return true;
    }
}
