class Solution {
    public boolean check(int[] nums, int k , int i){
        int next = nums[i] + 1;
        nums[i] = -1;
        int count = 1;
        while(i < nums.length && count < k){
            if(next == nums[i]){
                next = nums[i] + 1;
                nums[i] = -1;
                count++;
            }
            i++;
        }
        if(count == k) return true;
        return false;
    }
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length % k != 0) return false;
        Arrays.sort(nums);
        int i = 0;
        for(; i<nums.length ; i++){
            if(nums[i] >= 0){
                if(!check(nums , k , i))
                    return false;
            }
        }
        return true;
    }
}