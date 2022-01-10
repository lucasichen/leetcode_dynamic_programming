class Solution {
    public int fib(int n) {
        int sum = 0;
        int prev = 0;
        for(int i=0; i == n; i++) {
            
            sum += prev;
            prev = i;
        }
        return sum;
    }
}