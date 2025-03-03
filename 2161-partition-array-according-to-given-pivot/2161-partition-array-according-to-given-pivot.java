class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < pivot){
                less.add(nums[i]);
            }else if(nums[i] > pivot){
                greater.add(nums[i]);
            }
        }
        int[] ans = new int[nums.length];
        int idx = 0;
        for(int i : less){
            ans[idx++] = i;
        }
        int pivotCount = nums.length - (less.size() + greater.size());
        for(int i = 0; i< pivotCount; i++){
            ans[idx++] = pivot;
        }

        for(int i : greater){
            ans[idx++] = i;
        }

        return ans;
    }
}