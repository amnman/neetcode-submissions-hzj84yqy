class Solution {
    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        String open = "{[(";
        HashMap<String,String> map = new HashMap<>();
        map.put("}","{");
        map.put(")","(");
        map.put("]","[");
        for(String str:s.split("")){
            if(!map.containsKey(str)){
                stack.push(str);
            }else{
                if(!stack.empty() && map.get(str).equals(stack.peek())){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.size()==0;
    }
}
