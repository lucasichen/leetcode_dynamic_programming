class Solution {
    public int minCostClimbingStairs(int[] cost) {
        for (int i=2;i<cost.length;i++) {
            cost[i] = Math.min(cost[i-2],cost[i-1]);
        }
        return Math.min(cost[cost.length-1],cost[cost.length-2]);
        // int total = 0;
        // for (int i = -1; i < cost.length;i++) {
        //     try {
        //     if (cost[i+1] + cost[i+3] < cost[i+2]) {
        //         total += cost[i+1];
        //         i += 1;
        //         continue;
        //     }
        //     else if (cost[i+2] == cost[i+3]) {
        //         total += cost[i+1];
        //         i += 1;
        //         continue;
        //     }
        //     else {
        //         total += cost[i+2];
        //     }
        // }
        //     catch(ArrayIndexOutOfBoundsException e) {
        //         break;
        //     }
        // }
        // return total;
    }
    public static void main(String[] args) {
        Solution myObj = new Solution();
        int array[] = {10,15,20};
        System.out.println(myObj.minCostClimbingStairs(array));
    }
}