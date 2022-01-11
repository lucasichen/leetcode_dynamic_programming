
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
         int a = 1; int b = 1; int c;
        for (int i = 1; i < n ;i++) {
            c = a + b;
            a = b;
            b = c;
        }
         return b;
    }

    public static void main(String[] args) {
        Solution myObj = new Solution();
        System.out.println(myObj.climbStairs(4));
        System.out.println(Math.pow(2.0,4.0));
    }
}
