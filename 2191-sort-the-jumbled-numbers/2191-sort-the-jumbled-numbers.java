class Solution {
    public int getNumber(int N , int[] mapping){
        String s = N+"";
        int i = 0;
        int ans = 0;
        while(i < s.length()){
            ans = ans*10 + mapping[s.charAt(i) - '0'];
            i++;
        }
        return ans ;
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        int[] temp = new int[nums.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = getNumber(nums[i], mapping);
        }
        mergeSort(nums , temp , 0 , temp.length-1);
        return nums;
    }
    public static void mergeSort(int[] nums , int[] temp , int l , int h){
        if(l < h){
            int mid = l + (h-l)/2;
            mergeSort(nums , temp , l ,mid);
            mergeSort(nums , temp , mid+1 , h);
            mergeProcedure(nums , temp , l , mid , h);
        }
    }
    public static void mergeProcedure(int[] nums , int[] temp , int l , int mid , int h){
        int[] lSubNums = Arrays.copyOfRange(nums , l , mid+1);
        int[] rSubNums = Arrays.copyOfRange(nums , mid+1 , h+1);
        int[] lSubTemp = Arrays.copyOfRange(temp , l , mid+1);
        int[] rSubTemp = Arrays.copyOfRange(temp , mid+1 , h+1);
        int i = 0 , j = 0 , k = l;
        while(i < lSubTemp.length && j < rSubTemp.length){
            if(lSubTemp[i] <= rSubTemp[j]){
                temp[k] = lSubTemp[i];
                nums[k] = lSubNums[i];
                i++;
            }
            else{
                temp[k] = rSubTemp[j];
                nums[k] = rSubNums[j];
                j++;
            }
            k++;
        }
        while(i < lSubTemp.length){
            temp[k] = lSubTemp[i];
            nums[k] = lSubNums[i];
            i++;
            k++;
        }
        while(j < rSubTemp.length){
            temp[k] = rSubTemp[j];
            nums[k] = rSubNums[j];
            j++;
            k++;
        }
    }
}