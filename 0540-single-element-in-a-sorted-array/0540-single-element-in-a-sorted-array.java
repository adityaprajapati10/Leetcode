class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0 , high = nums.length-1 ;
        int prev , nxt;
        int n = nums.length;
        if(n == 1) return nums[0];
        if(nums[0] != nums[1])
            return nums[0];
            
        else if(nums[n-1] != nums[n-2])
            return nums[n-1];
        
        
        else{
            while(low<=high){
                int mid = ((high - low)/2) + low;
                prev = mid - 1;
                nxt = mid + 1;
                if(nums[mid] != nums[prev] && nums[mid] != nums[nxt]){
                    return nums[mid];
                }
                else if(mid % 2 == 0){
                    if(nums[prev] == nums[mid]) high = mid -1;
                    else low = mid + 1;
                }
                else{
                    if(nums[prev] == nums[mid]) low = mid + 1;
                    else high = mid-1;
                }
            }
        }
        return 0;
    }
}