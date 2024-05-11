class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.toCharArray().length != t.toCharArray().length)
            return false;
        int[] res = new int[128];
        for(char ch: s.toCharArray()){
            res[ch] += 1;
        }
        for(char ch: t.toCharArray()){
            if(res[ch] == 0)
                return false;
            res[ch] -= 1;
        }
        
        return true;
    }
}