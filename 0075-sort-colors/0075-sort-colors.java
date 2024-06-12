class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        for(int i : nums){
            if(i == 0) arr[0]++;
            else if(i == 1) arr[1]++;
            else arr[2]++;
        }
        int indx = 0;
        while(arr[0] > 0){
            nums[indx++] = 0;
            arr[0]--;
        }
        while(arr[1] > 0){
            nums[indx++] = 1;
            arr[1]--;
        }
        while(arr[2] > 0){
            nums[indx++] = 2;
            arr[2]--;
        }
        
    }
}