
public class P6_ZigZagConversion{
	public String convert(String s, int nRows) {
        StringBuilder sb = new StringBuilder();
        int distance = 2*(nRows-1);
        if(distance==0){
        	return s;
        }
        for(int i = 0;i<nRows;i++){
            if(i>=s.length()){
                break;
            }
            
            int increase = distance-2*i;
            
            if(i==nRows-1){
                increase = distance;
            }
            
            int x = i;
            while(x<s.length()){
                sb.append(s.charAt(x));
                x = x + increase;
                if(increase!=distance){
                    increase=distance-increase;
                }
            }
        }
        System.out.println(sb);
        return sb.toString();
    }
}
