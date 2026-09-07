// Last updated: 9/7/2026, 5:01:39 PM
1class Solution {
2    int[] arr;
3    HashSet<List<Integer>> hashSet = new HashSet<>();
4    public List<List<Integer>> findSubsequences(int[] nums) {
5        arr = nums;
6        List<Integer> arrayList = new ArrayList<>();
7        recursion(arrayList,0);
8        List<List<Integer>> result = new ArrayList<>(hashSet);
9        return result;
10    }
11
12    public void recursion(List<Integer> arrayList, int index){
13        if(arrayList.size()>=2) hashSet.add(new ArrayList(arrayList));
14
15        for(int i = index;i<arr.length;i++){
16            if(arrayList.size() == 0 || arr[i]>= arrayList.get(arrayList.size()-1)){
17                arrayList.add(arr[i]);
18                recursion(arrayList,i+1);
19                arrayList.remove(arrayList.size()-1);
20            }
21        }
22
23    }
24}