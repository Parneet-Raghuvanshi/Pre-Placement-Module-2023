class Solution {
    public List<String> generateParenthesis(int n) {
        List res = new ArrayList();
        findAll("(",1, 0, res, n);
        return res;
    }

    public void findAll(String curr, int o, int c, List<String> res, int n){
        if(curr.length() == 2*n){
            res.add(curr);
            return;
        }
        if(o < n) findAll(curr+"(", o+1, c, res, n);
        if(c < o) findAll(curr+")", o, c+1, res, n);
    }
}