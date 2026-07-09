// Last updated: 7/9/2026, 9:16:13 AM
class Solution {
    public int removeDuplicates(int[] nums) {

        int index = 1;
        int occurance = 1;

        for(int i=1; i < nums.length; i++){
            if (nums[i] == nums[i-1]){
                occurance++;
            }else{
                occurance = 1;
            }

            if (occurance <= 2){
                nums[index] = nums[i];
                index++;
            }
        }  

        return index;
    
    }
}