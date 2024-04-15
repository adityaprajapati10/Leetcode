class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String , Integer> map = new HashMap<>();
        for(String str : s1.split(" ")){
            map.put(str , map.getOrDefault(str , 0)+1);
        }
        for(String str : s2.split(" ")){
            map.put(str , map.getOrDefault(str , 0)+1);
        }
        String str = "";
        boolean flag = false;
        for(String s : s1.split(" ")){
            if(map.get(s) == 1){
                str += s + " ";
                flag = true;
            }
        }
        for(String s : s2.split(" ")){
            if(map.get(s) == 1){
                str += s + " ";
                flag = true;
            }
        }
        if(flag == false) return new String[0];
        return str.split(" ");
    }
}