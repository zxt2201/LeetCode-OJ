import java.util.HashMap;

public class P002_LongestSubStringWRC{
	public int lengthOfLongestSubstring(String s) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int max = 0;
        int len = 0;
        for(int i = 0;i<s.length();i++){
            len++;
            int code = s.codePointAt(i);
            if(map.containsKey(code)){
                if(i-map.get(code)<len){
                    len = i - map.get(code);
                }
            }
            max = Math.max(max,len);
            map.put(code,i);
            
        }
        return max;
    }
}
