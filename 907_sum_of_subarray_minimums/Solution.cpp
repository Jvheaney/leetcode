//Overflows sometimes because of ans
class Solution {
public:
  int sumSubarrayMins(vector<int>& arr) {
    stack<pair<int, int>> ple, nle;
      
    vector<int> left(arr.size()), right(arr.size());

    for(int i = 0; i < arr.size(); i++){
        left[i] =  i + 1;
        right[i] = arr.size() - i;
    } 
		
    for(int i = 0; i < arr.size(); i++){
      while(!ple.empty() && ple.top().first > arr[i]) {
         ple.pop(); 
      } 
      left[i] = ple.empty()? i + 1: i - ple.top().second;
      ple.push({arr[i],i});
			
      
      while(!nle.empty() && nle.top().first > arr[i]) {
        auto x = nle.top();
        nle.pop();
        right[x.second] = i - x.second;
      }
      nle.push({arr[i], i});
    }

    int ans = 0;
    int mod = 1e9 +7;
    for(int i = 0; i < arr.size(); i++){
      ans = (ans + arr[i]*left[i]*right[i])%mod;
    }
    return ans;
  }
};
