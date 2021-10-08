class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int len = nums.length;
        int shortest = len + 1;
        Deque<Integer> startingPoints = new ArrayDeque<>();
        
        int[] summation = new int[len + 1];
        for(int i = 0; i < len; i++){
            summation[i+1] = summation[i] + nums[i];
        }
        
        for(int i = 0; i < len + 1; i++){
            while(!startingPoints.isEmpty() && (summation[i]-summation[startingPoints.peek()]) >= k) {
                int curr = i - startingPoints.poll();
                if(curr < shortest){
                    shortest = curr;
                }
                
            }
            
            while(!startingPoints.isEmpty() && summation[i] <= summation[startingPoints.peekLast()]) {
                startingPoints.pollLast();
            }
            
            startingPoints.add(i);
        }
        
        if(shortest <= len){
            return shortest;
        }
        
        return -1;
    }
}
