class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int index = 0;
        int currentLowest = Integer.MAX_VALUE;
        quick(nums, 0, nums.length-1);
        //Scan for lowest, flip
        for(int i = 0; i<k; i++){
            //if the current index + 1 is less than length and next element is less
            //we will increase index and flip that number
            if(index + 1 < nums.length && nums[index] > nums[index+1] && nums[index+1] < currentLowest){
                index++;
                nums[index] *= -1;
                currentLowest = nums[index];
            }
            else{
                nums[index] *= -1;
            }
        }
        
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
        
        return sum;
    }
    
    public int partition(int arr[], int start, int end) {  
        int pivot = arr[end]; 
        int i = (start - 1);  
  
        for (int j = start; j <= end - 1; j++) {  
            if (arr[j] < pivot)  {  
                i++;
                int temp = arr[i];  
                arr[i] = arr[j];  
                arr[j] = temp;  
            }  
        }  
        int t = arr[i+1];  
        arr[i+1] = arr[end];  
        arr[end] = t;  
        return (i + 1);  
    }
    
    public void quick(int arr[], int start, int end) {  
        if (start < end) {  
            int p = partition(arr, start, end);
            quick(arr, start, p - 1);  
            quick(arr, p + 1, end);  
        }  
    }  
    
    
}
