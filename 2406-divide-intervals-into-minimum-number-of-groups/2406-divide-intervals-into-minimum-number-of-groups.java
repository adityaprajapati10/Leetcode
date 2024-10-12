class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        ArrayList<Integer> list = new ArrayList<>();
        for(int interval[] : intervals){
            if(list.size() == 0) list.add(interval[1]);
            else{
                boolean flag = false;
                for(int i = 0 ; i<list.size() ; i++){
                    if(list.get(i) < interval[0]){
                        list.set(i, interval[1]);
                        flag = true;
                        break;
                    }
                }
                if(flag == false) list.add(interval[1]);
                Collections.sort(list);
            }
        }
        return list.size();
    }
}