// Last updated: 7/9/2026, 9:13:55 AM
class Solution {
    public static int maxSatisfaction(int[] satisfaction) {
        
    	int n = satisfaction.length;
    	int ans = 0;
    	int sum = 0;
    	
    	Arrays.sort(satisfaction);
    	
    	for (int i = n-1; i >=0; i--) {
		
    		sum += satisfaction[i];
    		
    		if(sum + ans > ans ) {
    			ans += sum;	
    		}else {
    			break;

    		}
    			
		}
    	return ans;
    	
    }
}