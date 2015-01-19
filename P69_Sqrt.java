
public class P69_Sqrt{
	public int sqrt(int x) {
        long left =0;
        long right = x;
        while(left<right){
            long mid = (left+right)/2;
            if(mid*mid<x){
                left = mid+1;
            }else if(mid*mid==x){
                return (int)mid;
            }else{
                right = mid-1;
            }
        }
        if(left*left>x){
            return (int)(left-1);
        }else
            return (int)left;
    }
}
