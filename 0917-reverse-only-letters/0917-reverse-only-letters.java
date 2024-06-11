class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char c1 = arr[i];
            char c2 = arr[j];

            if (Character.isLetter(c1) && Character.isLetter(c2)) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else {
                if (!Character.isLetter(c1)) {
                    i++;
                }
                if (!Character.isLetter(c2)) {
                    j--;
                }
            }
        }

        return new String(arr);
    }
}
