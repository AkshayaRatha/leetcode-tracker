// Last updated: 7/9/2026, 9:15:16 AM
class Solution {
    public boolean isUgly(int n) {
        if(n == 0){
            return false;
        }
        if(n <= 3 && n > 0){
            return true;
        }
        if(n % 2 == 0){
            return isUgly(n / 2);
        }
        if(n % 3 == 0){
            return isUgly(n / 3);
        }
        if(n % 5 == 0){
            return isUgly(n / 5);
        }
        return false;
    }   
}