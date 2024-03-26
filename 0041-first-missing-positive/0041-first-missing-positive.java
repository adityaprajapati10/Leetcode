class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        if(n == 1){
            if(nums[0] == 0 || nums[0] == 1){
                return nums[0]+1;
            }
            else{
                return 1;
            }
        }
        int m=n+1;
        int result[] = new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0 && nums[i]<=n)
                result[nums[i]]=1;
        }
        for(int i=1;i<result.length;i++)
        {
            if(result[i]==0)
            {
                return i ;
            }
        }
        return n+1;
    }
}