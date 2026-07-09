// Last updated: 7/9/2026, 9:14:37 AM
class Solution {
    public boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) || 
               word.equals(word.toLowerCase()) || 
               (Character.isUpperCase(word.charAt(0)) && 
                word.substring(1).equals(word.substring(1).toLowerCase()));
    }
}