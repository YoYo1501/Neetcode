class Solution {
     public static String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        int[] map = new int[128];
        for(char c : t.toCharArray()) map[c]++;
        int l =0, minleft=-1, minlen = Integer.MAX_VALUE, count = t.length();
        for(int r =0; r< s.length();r++){
            if(map[s.charAt(r)]-->0) count--;

            while(count == 0){
                if(r-l+1 < minlen){
                    minlen = r-l+1;
                    minleft = l;
                }
                char lchar = s.charAt(l);
                l++;
                if(map[lchar] == 0) count++;
                map[lchar]++;

            }

        }
        if(minleft == -1 && minlen == Integer.MAX_VALUE) return "";
        return s.substring(minleft,minleft+minlen);



    
        
    }
}
