class Solution {
    public int specialArray(int[] nums) {
        int count = 0 , x = 0;
        while(x <= nums.length){
            for(int i = 0 ; i<nums.length ; i++){
                if(nums[i] >= x) count++;
            }
            if(x == count) return x;
            count = 0;
            x++;
        }    
        return -1;
    }
}