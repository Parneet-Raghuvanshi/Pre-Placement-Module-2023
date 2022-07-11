class Solution {
    public int firstUniqChar(String s) {
        char[] word = s.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        for(char c: word)
            map.put(c, map.getOrDefault(c, 0)+1);
        for(int i=0;i<word.length;i++)
            if(map.get(word[i])==1)
                return i ;
        return -1;
    }
}