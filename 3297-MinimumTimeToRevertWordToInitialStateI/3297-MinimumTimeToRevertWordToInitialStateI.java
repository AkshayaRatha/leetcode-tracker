// Last updated: 7/9/2026, 9:13:41 AM
class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        for(int i=k; i<word.length(); i+=k){
            if(word.startsWith(word.substring(i))){
                return i/k;
            }
        }
        return word.length()%k==0 ? word.length()/k : word.length()/k+1;
    }
}