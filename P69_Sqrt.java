
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
        if(left*left>x&&(left-1)*(left-1)<x){
            return (int)(left-1);
        }else if(left*left<=x&&(left+1)*(left+1)>x){
            return (int)left;
        }
        return -1;
    }
}
