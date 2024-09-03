class Solution {
    public int getLucky(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : s.toCharArray()) {
            stringBuilder.append((ch - 'a' + 1));
        }
        int sum = 0;
        while (k > 0) {
            sum = 0;
            for (int i = 0; i < stringBuilder.length(); i++) {
                sum = sum + (stringBuilder.charAt(i) - '0');
            }
            stringBuilder.setLength(0);
            stringBuilder.append(sum);
            k--;
        }
        return sum;
    }
}