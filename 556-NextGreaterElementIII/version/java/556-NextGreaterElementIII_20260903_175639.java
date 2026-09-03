// Last updated: 9/3/2026, 5:56:39 PM
1class Solution {
2    public int nextGreaterElement(int n) {
3        char arr[]=(Integer.toString(n)).toCharArray();
4        int i=arr.length -2;
5        while( i>=0 && arr[i] >=arr[i+1]){
6            i--;
7        }
8        if(i== -1) return -1;
9        int k=arr.length-1;
10        while( k>=0 && arr[i] >= arr[k]){ 
11            k--;
12        }
13        swap(arr,k,i);
14        StringBuilder res= new StringBuilder();
15        for(int j=0;j<=i;j++){
16            res.append(arr[j]);
17        }
18        for(int j=arr.length-1;j>i;j--){
19            res.append(arr[j]);
20
21        }
22        long ans=Long.parseLong(res.toString());
23        return (ans <= Integer.MAX_VALUE)? (int)ans :-1;
24   
25    }
26     private void swap(char[] arr,int k,int i){
27        char temp=arr[k];
28        arr[k]=arr[i];
29        arr[i]= temp;
30    }
31}