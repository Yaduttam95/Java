class Solution {
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
        Map<Integer, String>big = new HashMap<>();
        
        String[]ones = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
         "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
         "Seventeen", "Eighteen", "Nineteen"};

        String[]tens = new String[]{"Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", 
        "Eighty", "Ninety"};
        
        big.put(0, "");
        big.put(100, "Hundred");
        big.put(1000, "Thousand");
        big.put(1000000, "Million");
        big.put(1000000000, "Billion");

        String s = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        if(s.length() > 9) {
            sb.append(ones[s.charAt(0)-'0'] + " " + big.get(1000000000)+ " ");
            s = s.substring(1);
        } if(s.length() > 6) {
            three_place(sb, big, ones, tens, s.substring(0, s.length()-6), 1000000);
            s = s.substring(s.length()-6);
        } if(s.length() > 3) {
            three_place(sb, big, ones, tens, s.substring(0, s.length()-3), 1000);
            s = s.substring(s.length()-3);
        }
        three_place(sb, big, ones, tens, s, 0);
        while(sb.charAt(sb.length()-1) == ' ') sb = sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    public void three_place(StringBuilder sb, Map<Integer, String>hm, String[]ones, String[]tens, String s, int num) {
        char ch1 = '0';
        char ch2 = '0';
        char ch3 = '0';
        if(s.length() == 3) {
            ch1 = s.charAt(0);
            ch2 = s.charAt(1);
            ch3 = s.charAt(2);
        } else if(s.length() == 2) {
            ch2 = s.charAt(0);
            ch3 = s.charAt(1);
        } else if(s.length() == 1){
            ch3 = s.charAt(0);
        } else return;
        
        if(!(ch1 == '0' && ch2 == '0' && ch3 == '0')) {
            String temp = s;
            if(ch1 != '0') {
                temp = s.substring(1);
                sb.append(ones[s.charAt(0)-'0'] + " " + hm.get(100) + " ");
            } if(ch2 != '0') {
                int n = Integer.parseInt(temp);
                if(n < 20) sb.append(ones[n]+" ");
                else sb.append(tens[ch2-'0']+" ");
            } if(ch3 != '0' && ch2 != '1') {
                sb.append(ones[ch3-'0']+" ");
            }
            sb.append(hm.get(num) + " ");
        }
    }
}
