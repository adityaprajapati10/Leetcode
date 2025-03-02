class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] arr : nums1){
            map.put(arr[0],arr[1]);
        }
        for(int[] arr : nums2){
            map.put(arr[0], map.getOrDefault(arr[0], 0)+arr[1]);
        }
        int[][] ans = new int[map.size()][2];
        int idx = 0;
        for(int i : map.keySet()){
            ans[idx][0] = i;
            ans[idx][1] = map.get(i);
            idx++;
        }
        Arrays.sort(ans, (a, b) -> Integer.compare(a[0], b[0]));
        return ans;
    }
}