// Last updated: 7/9/2026, 9:14:32 AM
class Solution {
    public String reverseStr(String s, int k) {
       char c[]=s.toCharArray();
       int n=s.length();
       for(int i=0;i<n;i+=2*k){
        int l=i;
        int r=Math.min(i+k-1,n-1);
        while(l<r){
            char temp=c[l];
            c[l++]=c[r];
            c[r--]=temp;
        }
       }
       return new String(c);
    }
}