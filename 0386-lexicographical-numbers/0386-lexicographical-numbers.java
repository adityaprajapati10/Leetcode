class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1 ; i <= 9 ; i++){
            solve(i, n, list);
        }
        return list;
    }
    public void solve(int num , int n , List<Integer> list){
        if(num > n) return;
        list.add(num);
        for(int add = 0 ; add <= 9 ; add++){
            int newNum = (num*10) + add;
            if(newNum > n){
                return;
            }
            solve(newNum , n , list);
        }
    }
}