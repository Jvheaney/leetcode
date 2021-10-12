class Solution {
public:
    int largestSumAfterKNegations(vector<int>& nums, int k) {
        int index = 0;
        int currentLowest = INT_MAX;
        quick(nums, 0, nums.size() - 1);
        for(int i = 0; i<k; i++){
            if(index + 1 < nums.size() && nums[index] > nums[index + 1] && nums[index+1] < currentLowest) {
                index++;
                nums[index] *= -1;
                currentLowest = nums[index];
            }
            else{
                nums[index] *= -1;
            }
        }
        
        int sum = 0;
        for(int i = 0; i<nums.size(); i++){
            sum += nums[i];
        }
        
        return sum;
    }
    
public:
    int partition(vector<int>& arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        
        for(int j = start; j <= end - 1; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
        
        return i+1;
    }
    
public:
    void quick(vector<int>& arr, int start, int end) {
        if (start < end) {  
            int p = partition(arr, start, end);
            quick(arr, start, p - 1);  
            quick(arr, p + 1, end);  
        }
    }
};
