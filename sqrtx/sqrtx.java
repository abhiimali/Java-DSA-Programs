class Solution {
    public int  mySqrt(int x) {
        
         long start = 0 ; long end = x ; long ans = 0 ;
        while(start<=end)
        {
            long mid = start + (end-start)/2 ;
            if(mid*mid <= x )
            {
                ans = mid ;
                start=mid+1;
            }
            else
            {
                end=mid-1;
            } // simple binary search logic


        }
        return (int) ans ;
    }
}