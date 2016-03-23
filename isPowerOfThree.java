public class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1) return true;
        while (n >3) {
            if (n%3!=0) return false;
            n = n/3;
        }
        if (n==3) return true;
        else return false;
    }
}

