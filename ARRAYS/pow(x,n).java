class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long a = n;
        if(n<0){
            x = 1/x;
            a = -a;
        }
        while(a>0){
            if(a%2==1) ans = ans*x;
            x = x*x;
            a = a/2;
        }
        return ans;
    }
}
