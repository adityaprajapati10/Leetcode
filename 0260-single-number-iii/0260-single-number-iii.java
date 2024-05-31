class Solution {
    public int[] singleNumber(int[] nums) {
        int n [] = new int [2] ;
       HashMap<Integer , Integer > map = new HashMap<>();
       for(int i = 0 ; i<nums.length ; i++){
           if(map.containsKey(nums[i])){
               map.put(nums[i] , map.get(nums[i])+1);
           }
           else{
               map.put(nums[i] , 1);
           }
       }
       int index = 0;
       for(int i = 0 ; i<nums.length ; i++){
           if(map.get(nums[i]) == 1){
               n[index] = nums[i];
               index++ ;
               if(index == 2){
                   break ;
               }
           }
       }
       return n ;
    }
}