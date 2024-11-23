class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int n = box.length;
        int m = box[0].length;
        for(int i = 0 ; i<n ; i++){
            for(int j = 0; j<m ; j++){
                if(j > 0 && box[i][j] == '.'){
                    int k = j;
                    while(box[i][k] == '.'  && k > 0){
                        if(box[i][k-1] == '*') break;
                        char swap = box[i][k];
                        box[i][k] = box[i][k-1];
                        box[i][k-1] = swap;
                        k--;
                    }
                }
            }
        }
        char[][] sol = new char[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sol[j][n - 1 - i] = box[i][j];
            }
        }
        return sol;
    }
}