class Solution {
    public boolean isValid(String s) {
        return solution02(s);
    }
    public boolean solution01(String s){
        Stack<String> stack = new Stack<>();
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
    public boolean solution02(String s){
        Stack<String> stack = new Stack<>();
        for(String str:s.split("")){
            if(str.equals("[") || str.equals("{") || str.equals("(")){
                stack.push(str);
            }else{
                if(stack.empty()){
                    return false;
                }
                String p = stack.pop();
                if(str.equals("}") && !p.equals("{")){
                    return false;
                }else if(str.equals("]") && !p.equals("[")){
                    return false;
                }else if(str.equals(")") && !p.equals("(")){
                    return false;
                }
            }
        }
        return stack.size()==0;
    }
}
