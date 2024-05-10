class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         // Initialize an array of count
        int[] counter = new int[128];
        // Traverse a loop through the entire String of magazine where char ch stores the char at the index of magazine...
        for(final char ch: magazine.toCharArray())
            ++counter[ch];
        // Run another for loop for ransomNote...
        for (final char ch : ransomNote.toCharArray())
            if (--counter[ch] < 0)
                return false;
        return true;      // If nothing goes wrong, return true...
    }
}