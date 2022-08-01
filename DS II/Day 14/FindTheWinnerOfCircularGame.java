class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> arr = new ArrayList<>();
        for (int i=0;i<n;i++) arr.add(i+1);
        return solve(arr,k);
    }

    static int solve(List<Integer> arr,int k){
        int index = 0;
        while (arr.size()!=1) {
            index = (index+k-1)%arr.size();
            arr.remove(index);
        }
        return arr.get(0);
    }
}