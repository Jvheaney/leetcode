class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair<Integer, Integer>> nwd = new Stack<Pair<Integer, Integer>>();
        int[] daysToWait = new int[temperatures.length];
        
        for(int i = 0; i<temperatures.length; i++){
            while(!nwd.isEmpty() && nwd.peek().getKey() < temperatures[i]){
                daysToWait[nwd.peek().getValue()] = i - nwd.peek().getValue();
                nwd.pop();
            }
            nwd.push(new Pair<>(temperatures[i],i));
        }
        
        return daysToWait;
        
    }
}
