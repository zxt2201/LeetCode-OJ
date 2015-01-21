
public class P179_LargestNumber{
	public String largestNumber(int[] num) {
        ArrayList<String> al = new ArrayList<String>();
        for(int i = 0;i<num.length;i++){
            al.add(String.valueOf(num[i]));
        }
        al.sort(new Comparator<String>(){
            public int compare(String a, String b){
                /** Comparator 1 
                int i=0;
                while(i<(a.length()+b.length())){
                    int ia = a.length()==1?0:i%(a.length());
                    int ib = b.length()==1?0:i%(b.length());
                    
                    if(a.charAt(ia)<b.charAt(ib)){//int a < int b
                        return -1;
                    }else if(a.charAt(ia)>b.charAt(ib)){
                        return 1;
                    }
                    i++;
                }
                if(a.length()==b.length()){
                    return 0;
                }
                return a.length()>b.length()?1:-1;
                **/
                /** Comparator 2 **/
                String ab = a+b;
                String ba = b+a;
                return ab.compareTo(ba);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for(int i = num.length-1;i>=0;i--){
            if(flag&&al.get(i).equals("0")){
                return "0";
            }else{
                sb.append(al.get(i));
                flag = false;
            }
            
        }
        return sb.toString();
    }
}
