class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for (String x : s.split(" ")) {
            sb.append(reverse(x.toCharArray()));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public String reverse(char[] s) {
        int l = s.length;
        for (int i = 0;i < l/2 ; i++) {
            char temp = s[i];
            s[i] = s[l-i-1];
            s[l-i-1] = temp;
        }
        return new String(s);
    }
}