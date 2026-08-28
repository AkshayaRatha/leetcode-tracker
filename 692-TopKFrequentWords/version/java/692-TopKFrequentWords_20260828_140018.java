// Last updated: 8/28/2026, 2:00:18 PM
1class Solution {
2    public List<String> topKFrequent(String[] words, int k) {
3        HashMap<String, Integer>map = new HashMap<>();
4        for(String i : words){
5            map.put(i, map.getOrDefault(i,0)+1);
6        }
7        List<String>list = new ArrayList<>(map.keySet());
8        Collections.sort(list , (a,b)->{
9            if(map.get(a)==map.get(b)){
10                return a.compareTo(b);
11            }
12            else{
13                return map.get(b)-map.get(a);
14            }
15        });
16
17        List<String>ans = new ArrayList<>();
18
19        for(int i=0;i<k;i++){
20            ans.add(list.get(i));
21        }
22
23        return  ans;
24    }
25}