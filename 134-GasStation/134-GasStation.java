// Last updated: 7/9/2026, 9:15:58 AM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0, totalCost = 0;
        int n = gas.length;

        for(int i = 0; i < n; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalGas < totalCost) return -1;

        int currGas = 0, startInd = 0;

        for(int i = 0; i < n; i++){
            currGas += gas[i] - cost[i];

            if(currGas < 0){
                startInd = i + 1;
                currGas = 0;
            }
        }

        return startInd;
    }
}