
public class P7_ReverseInteger{
	public int reverse(int x) {
        boolean pos = x>=0;
        int abs = x>=0?x:-x;
        int reverse = 0;
        
        while(abs>0){
            int oldRev = reverse;
            reverse = reverse*10+abs%10;
            
            if((reverse-abs%10)/10!=oldRev){
                return 0;
            }
            
            abs = abs/10;
            
        }
        return pos?reverse:(-reverse);
    }
}
