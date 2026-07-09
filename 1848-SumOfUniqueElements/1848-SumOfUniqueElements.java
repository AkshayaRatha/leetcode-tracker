// Last updated: 7/9/2026, 9:13:50 AM
class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int [] result=new int[101];
        for(int num: nums){
            result[num]++;
        }
        for(int i=0;i<result.length;i++){
            if(result[i]==1){
                sum+=i;
            }
        }
        return sum;
      
        
    
    }
}