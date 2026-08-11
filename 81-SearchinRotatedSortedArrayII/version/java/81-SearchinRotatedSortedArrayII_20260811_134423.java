// Last updated: 8/11/2026, 1:44:23 PM
1class Solution {
2  static boolean search(int[]arr, int target) {
3        int start = 0;
4        int end = arr.length - 1;
5        while (start <= end) {
6
7            int mid = start + (end - start) / 2;
8            if (arr[mid] == target) {
9                return true;
10            }
11            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
12                start ++;
13                end --;
14                continue;
15            }
16            if(arr[mid] >= arr[start]){
17                if(arr[mid] > target && arr[start] <= target){
18                    end = mid-1;
19                }else start = mid+1;
20            } else{
21                if(arr[mid] < target && arr[end] >= target){
22                    start = mid+1;
23                }else end = mid-1;
24            }
25        }
26        return false;
27        }
28    }
29
30 