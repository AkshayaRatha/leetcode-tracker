// Last updated: 9/9/2026, 4:11:24 PM
1class Solution {
2    public String frequencySort(String s) {
3        Map<Character, Integer> charCount = new HashMap<>();
4        for (char c : s.toCharArray()) {
5            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
6        }
7        List<Character> sortedChars = new ArrayList<>(charCount.keySet());
8        Collections.sort(sortedChars, (a, b) -> charCount.get(b) - charCount.get(a));
9        StringBuilder result = new StringBuilder();
10        for (char c : sortedChars) {
11            result.append(String.valueOf(c).repeat(charCount.get(c)));
12        }
13        return result.toString();
14    }
15}