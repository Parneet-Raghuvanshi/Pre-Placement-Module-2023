class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int sum = 0;
        for (int x : map.values()){
            sum += (x%2 == 0 ? x : x-1);
        }

        for (int x : map.values()) {
            if (x % 2 == 1) return sum+1;
        }
        return sum;
    }
}