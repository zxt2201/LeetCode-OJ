
public class P139_WordBreak{
	public boolean wordBreak(String s, Set<String> dict) {
        boolean[] flags = new boolean[s.length()+1];
        flags[0]=true;
        for(int i=0;i<s.length();i++){
            if(flags[i]==true){
                for(String w:dict){
                    int len = w.length();
                    if(len+i<=s.length()){
                        if(w.equals(s.substring(i,len+i))){
                            flags[i+len] = true;
                        }
                    }
                }
            }
        }
        return flags[s.length()];
    }
}
