import java.util.HashMap;

public class P001_TwoSum{
	public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i],i);
        }
        for(int i=0;i<numbers.length;i++){
            int t = target-numbers[i];
            Integer j=map.get(t);
            if(j!=null&&j!=i){
                if(i>j){
                    t = i;
                    i = j;
                    j = t;
                }
                return new int[]{i+1,j+1};
            }
        }
        return null;
    }
}
