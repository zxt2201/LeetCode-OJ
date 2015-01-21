
public class P169_MajorityElement{
	public int majorityElement(int[] num) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<num.length;i++){
            if(stack.empty()){
                stack.push(num[i]);
            }else{
                if(stack.peek().equals(num[i])){
                    stack.push(num[i]);
                }else{
                    stack.pop();
                }
            }
        }
        return stack.peek();
    }
}
