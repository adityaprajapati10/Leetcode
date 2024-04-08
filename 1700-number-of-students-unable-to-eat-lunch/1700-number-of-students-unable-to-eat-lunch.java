class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> qe = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < students.length ; i++){
            qe.add(students[i]);
        }
        for(int i = sandwiches.length-1 ; i >= 0 ; i--){
            st.push(sandwiches[i]);
        }

        int count = 0;
        while(!qe.isEmpty() && count < qe.size()){
            if(st.peek() == qe.peek()){
                st.pop();
                qe.poll();
                count = 0;
            }else{
                qe.add(qe.poll());
                count++;
            }
        }
        return qe.size();
    }
}