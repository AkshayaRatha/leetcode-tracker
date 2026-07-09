// Last updated: 7/9/2026, 9:13:36 AM
class Solution {
    public int minimumPushes(String word) {
         int a[]=new int[26];
        for(char c:word.toCharArray())
        {
            a[c-'a']++;
        }
        Arrays.sort(a);
        int index=1,sum=0,count=1;
        for(int i=25;i>=0;i--)
        {
            if(index<=8)
            {
                index++;
            }
            else
            {
                index=2;
                count++;
            }
            sum=sum+(a[i]*count);
        }
        return sum;
    }
}