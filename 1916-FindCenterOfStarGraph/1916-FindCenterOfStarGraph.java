// Last updated: 7/9/2026, 9:13:48 AM
class Solution {
    public int findCenter(int[][] edges) {
        int a = edges[0][0];
        int b = edges[0][1];
        int c = edges[1][0];
        int d = edges[1][1];
        
        if(a == c || a == d) return a;
        return b;
    }
}