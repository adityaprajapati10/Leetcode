// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         Arrays.sort(nums);
//         int low = 0, high = nums.length - 1;
//         int result1 = -1;
//         List<Integer> ans = new ArrayList<>();

//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (nums[mid] == target) {
//                 result1 = mid;
//                 high = mid - 1;
//             } else if (nums[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }

//         if (result1 != -1) {
//             ans.add(result1);
//             if (result1 + 1 < nums.length && nums[result1 + 1] == target) {
//                 ans.add(result1 + 1);

//             }
//             if (result1 - 1 >= 0 && nums[result1 - 1] == target) {
//                 ans.add(result1 - 1);
//             }
//         }

//         return ans;
//     }
// }
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                list.add(i);
            }
        }
        return list;
    }
}