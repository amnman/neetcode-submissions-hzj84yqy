class MinStack {

    private List<Integer> list;

    public MinStack() {
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        list.add(val);
    }
    
    public void pop() {
        if(list.size()!=0){
            list.remove(list.size()-1);
        }
    }
    
    public int top() {
        if(list.size()!=0){
            return list.get(list.size()-1);
        }else{
            return 0;
        }
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int i : list){
            if(min>i){
                min=i;
            }
        }
        return min;
    }
}
