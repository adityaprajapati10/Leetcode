class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;
        long count = 0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i] - i)){
                count+=(long)hm.get(nums[i] - i);
                }
            hm.put(nums[i] - i,hm.getOrDefault(nums[i] - i,0)+1);
        } 
        long tot=((long)(n)*(long)(n-1))/(long)2;
       
        return tot-(long)count;
    }
}

