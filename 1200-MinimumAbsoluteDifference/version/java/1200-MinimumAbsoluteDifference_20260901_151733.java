// Last updated: 9/1/2026, 3:17:33 PM
1class Solution {
2    public List<List<Integer>> minimumAbsDifference(int[] arr) {
3        List<List<Integer>> ans = new ArrayList<>();
4        int n = arr.length;
5        Arrays.sort(arr);
6        int minAbsDiff = Integer.MAX_VALUE;
7
8        for(int i = 0; i < n - 1; i++){
9            int diff = Math.abs(arr[i] - arr[i+1]);
10            if(diff < minAbsDiff){
11                minAbsDiff = diff;
12            }
13        }
14
15        for(int i = 0; i < n - 1; i++){
16            int diff = arr[i+1] - arr[i];
17            if(diff == minAbsDiff){
18                List<Integer> list = new ArrayList<>();
19                list.add(arr[i]);
20                list.add(arr[i + 1]);
21
22                ans.add(new ArrayList<>(list));
23            }
24        }
25        return ans;
26    }
27}