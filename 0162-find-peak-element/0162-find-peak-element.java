class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(nums.length == 1 ){
            return 0 ;
        }
        if(nums.length == 2){
           
            if(nums[0]>nums[1]){
                return 0;  
            } 
            else {
                return 1;
            }
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        
        for(int i = 1 ; i<nums.length-1 ; i++){
           
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                return i;
            }
        }
        return n-1;
    }
}