// Last updated: 7/9/2026, 9:16:22 AM
class Solution {
    public int climbStairs(int n) {
        if(n<=2)
        {
            return n;
        }
        int a[] = new int[n+1];
        a[1] = 1;
        a[2] = 2;
        for(int i=3;i<=n;i++)
        {
            a[i] = a[i-1]+a[i-2];
        }
        return a[n];
    }
}