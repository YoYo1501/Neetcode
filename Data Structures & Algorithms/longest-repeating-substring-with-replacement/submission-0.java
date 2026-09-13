class Solution {
     public int characterReplacement(String s, int k) {
        int l = 0,maxcount=0,maxlen = 0;
        int[] counts = new int[26];
        for(int r =0; r< s.length();r++){
            int rightcharcurrent = s.charAt(r) - 'A';
            counts[rightcharcurrent]++;
            maxcount = Math.max(maxcount, counts[rightcharcurrent]);

            int wwindowlen = r - l + 1;
            if (wwindowlen - maxcount > k) {
                int leftcharcurrent = s.charAt(l) -'A';
                counts[leftcharcurrent] --;
                l++;
            }
            else{
                maxlen=Math.max(maxlen,wwindowlen);
            }
        }




        return maxlen;
        
    }
}
