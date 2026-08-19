// Last updated: 8/19/2026, 2:27:09 PM
1class Solution {
2    public int findNthDigit(int n) {
3        if(n<10) return n;
4        long sum = 9, numberOfDigits = 2, pow=10;
5        while(true) {
6            long countDigits = ((pow*10) - pow)*numberOfDigits;
7            if(sum+countDigits>=n) {
8                long diff = ((n-sum-1)/numberOfDigits)+1;
9                long digit = (n-sum)%numberOfDigits;
10                long num = pow -1+diff;
11                if(digit==0) return (int)(num%10);
12                return Long.toString(num).charAt((int)digit-1)-'0';
13            }
14            sum+=countDigits;
15            numberOfDigits++;
16            pow*=10;
17        }
18    }
19}