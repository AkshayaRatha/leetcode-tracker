// Last updated: 7/9/2026, 9:14:24 AM
class Solution {
    public boolean judgeCircle(String move) {
        int l=0, r=0, u=0, d=0;
        
        for(int i=0;i<move.length();i++){
            if(move.charAt(i)=='L')
               l++;
            if(move.charAt(i)=='R')
               r++;  
            if(move.charAt(i)=='U')
               u++; 
            if(move.charAt(i)=='D')
               d++;
        }
        if(u==d&&l==r)
           return true;
        return false;
    }
}