class Solution {
    public boolean isNumber(String s) {
        if(s.charAt(0) == '-' || s.charAt(0) == '+') s = s.substring(1);
        if(s.equals(".") || s.equals("")) return false;
        boolean deci = false;
        boolean expo = false;
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch == '.' || ch == 'e' || ch == 'E') {
                if(ch == 'e' || ch == 'E') {
                    if(expo || i == s.length()-1 || i == 0) return false;
                    expo = true;
                    if(s.charAt(i+1) == '-' || s.charAt(i+1) == '+') {
                        if(i+1 == s.length()-1) return false;
                        i++; 
                    }
                } else if(ch == '.') {
                    if((i != 0 && s.charAt(i-1) >= '0' && s.charAt(i-1) <= '9') || 
                    (i != s.length()-1 && s.charAt(i+1) >= '0' && s.charAt(i+1) <= '9')) {
                        if(deci || expo) return false;
                        deci = true;
                    } else return false;
                } else if(ch == '-' || ch == '+') return false;
            } else if(!(ch >= '0' && ch <= '9')) return false;
        }
        return true;
    }
}
