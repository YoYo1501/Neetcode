class Solution {
     public boolean checkInclusion(String s1, String s2) {
        int[] counts1 = new int[26];
        int[] counts2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            counts1[s1.charAt(i) - 'a']++;
        }
        int l = 0;
        for (int r = 0; r < s2.length(); r++) {
            counts2[s2.charAt(r) - 'a']++;
            if (r - l + 1 > s1.length()) {
                counts2[s2.charAt(l) - 'a']--;
                l++;
            }
            
            if (Arrays.equals(counts1, counts2)) {
                return true;
            
        }
    }
    return false;

    }
}
