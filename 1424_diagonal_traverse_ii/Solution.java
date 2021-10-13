class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        int returnLength = 0;
        int maxLength = 0;
        Map<Integer, List<Integer>> result = new HashMap<>();
        
        for (int y = nums.size() - 1; y >= 0; y--) {
            for (int x = 0; x < nums.get(y).size(); x++) {
                result.putIfAbsent(y + x, new ArrayList<>());
                result.get(y + x).add(nums.get(y).get(x));
                maxLength = Math.max(maxLength, y + x);
                returnLength++;
            }
        }
        
        int[] ans = new int[returnLength];
        int i = 0;
        
        for (int key = 0; key <= maxLength; ++key) {
            List<Integer> value = result.get(key);
            if (value == null) continue;
            for (int v : value) ans[i++] = v;
        }
        return ans;
    }
}
