// Last updated: 8/24/2026, 3:07:55 PM
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        ArrayList<Integer> ans= new ArrayList<>();
4        int pfreq []=new int [256];
5        int sfreq []=new int [256];
6        int low=0;
7        int len=0;
8        for(int i=0;i<p.length(); i++){
9            pfreq[p.charAt(i)]++;
10        }
11        for(int high=0; high<s.length(); high++){
12               sfreq[s.charAt(high)]++;
13               len=high-low+1;
14            
15               while(len>p.length()){
16                    sfreq[s.charAt(low)]--;
17                    low++;
18                    len = high - low + 1;
19                   
20               }
21                     if(isAnagram(sfreq,pfreq)){
22                    ans.add(low);
23                  }
24        }
25        return ans;
26    }
27
28    public boolean isAnagram(int []sfreq, int [] pfreq){
29        for(int i=0;i<256; i++ ){
30            if(pfreq[i]!=sfreq[i]){
31                return false;
32            }
33        }
34        return true;
35    }
36}