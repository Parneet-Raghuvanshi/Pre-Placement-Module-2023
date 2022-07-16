class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> sol = new ArrayList<>();
        String out = "";
        solve(s,out,sol);
        return sol;
    }

    public static void solve(String input,String output,List<String> sol){
        if (input.length()==0){
            sol.add(output);
            return;
        }
        if (Character.isLetter(input.charAt(0))) {
            String out1 = output + String.valueOf(input.charAt(0)).toLowerCase();
            String out2 = output + String.valueOf(input.charAt(0)).toUpperCase();
            input = input.substring(1);
            solve(input,out1,sol);
            solve(input,out2,sol);
        }
        else {
            output = output+input.charAt(0);
            input = input.substring(1);
            solve(input,output,sol);
        }
    }
}