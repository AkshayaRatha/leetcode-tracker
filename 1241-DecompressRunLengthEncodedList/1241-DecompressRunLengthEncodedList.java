// Last updated: 7/9/2026, 9:14:03 AM

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int totalLength =0;
        int index=0;
        for(int i=0; i<nums.length; i=i+2){
            totalLength = totalLength+nums[i];

        }
        int[] result = new int[totalLength];
        
        for (int i = 0; i < nums.length; i =i+2) {
            int freq = nums[i];      
            int val = nums[i + 1];
            Arrays.fill(result,index,index+freq,val);
            index = index+freq;   
            
        }
        
        return result; 
    }
}