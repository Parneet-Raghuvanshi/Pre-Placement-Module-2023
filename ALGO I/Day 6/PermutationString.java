class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        int l1 = s1.length(),l2 = s2.length();

        for (int i = 0; i < l1; i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(count1, count2)) return true;

        for (int i = l1; i < l2; i++) {
            count2[s2.charAt(i) - 'a']++;
            count2[s2.charAt(i - l1) - 'a']--;
            if (Arrays.equals(count1, count2)) return true;
        }

        return false;
    }
}