class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n == 1){
            if(nums[0] == 0 || nums[0] == 1){
                return nums[0]+1;
            }
            else{
                return 1;
            }
        }
        HashMap<Integer , Integer > map = new HashMap<>();
        for(int i = 0 ; i<n ; i++){
            map.put(nums[i],1);
        }  
         for(int i = 1 ; i<=n ; i++){
            if(map.containsKey(i)){
                map.remove(i);
            }
            else{
                return i ;
            }
        }
        return n+1;
    }
}