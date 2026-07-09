// Last updated: 7/9/2026, 9:13:38 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,map.get(nums[i]));
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
            if(max==map.get(nums[i])){
                c++;
            }
            map.remove(nums[i]);
            }
        }
        int sum=0;
        while(c-- >0){
            sum+=max;
        }
        return sum;
    }
    
}