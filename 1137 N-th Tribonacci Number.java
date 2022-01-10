
class Solution {
    public int tribonacci(int n) {
        if(n < 2) {
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 0;
        for (int i = 2; i <n; i++) {
            d = a+b+c;
            a=b;
            b=c;
            c=d;
        }
        return c;
    }
    
    public static void main(String[] args) {
        Solution myObj = new Solution();
        System.out.println(myObj.tribonacci(4));
    }
}