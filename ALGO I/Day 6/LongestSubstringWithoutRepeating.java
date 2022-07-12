class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0,j = 0,count  = 0,ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while (j < s.length()) {
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c,0)+1);
            if (map.size() == j-i+1) {
                ans = Math.max(ans,j-i+1);
                j++;
            }
            else if (map.size() < j-i+1) {
                while (map.size() < j-i+1) {
                    char ch = s.charAt(i);
                    map.put(ch,map.get(ch)-1);
                    i++;
                    if (map.get(ch)==0) map.remove(ch);
                }
                j++;
            }
        }
        return ans;
    }
}