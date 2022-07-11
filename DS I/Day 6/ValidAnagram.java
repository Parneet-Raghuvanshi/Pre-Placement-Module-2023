class Solution {
    public boolean isAnagram(String str, String t) {
        if (str.length() != t.length()) return false;
        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }
        for (int i=0;i<t.length();i++) {
            char c = t.charAt(i);
            if (chars.contains(c)) {
                chars.remove(chars.indexOf(c));
            }
            else return false;
        }
        return true;
    }
}