class Solution {
    public List<String> letterCombinations(String digits) {
        // Exception Case //
        if (digits.length()<=0) {
            return new ArrayList<>();
        }
        HashMap<Character,String> input = new HashMap<>();
        input.put('2',"abc");
        input.put('3',"def");
        input.put('4',"ghi");
        input.put('5',"jkl");
        input.put('6',"mno");
        input.put('7',"pqrs");
        input.put('8',"tuv");
        input.put('9',"wxyz");
        List<String> solution = new ArrayList<>();
        solve(input,0,digits,"",solution);
        return solution;
    }

    static void solve(HashMap<Character,String> input,int index,String inStr,String output,List<String> solution) {
        if (output.length()==inStr.length()){
            solution.add(output);
            return;
        }
        String str = input.get(inStr.charAt(index));
        for (int i = 0; i < str.length(); i++) {
            String tmp = output + str.charAt(i);
            solve(input,index+1,inStr,tmp,solution);
        }
    }
}