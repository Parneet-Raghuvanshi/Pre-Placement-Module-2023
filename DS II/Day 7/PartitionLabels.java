class Solution {
    public List<Integer> partitionLabels(String s) {
        int f[]=new int[502];
        for(int i=0;i<s.length();i++) {
            f[s.charAt(i)]=i;
        }
        List<Integer>ans=new ArrayList<>();
        int prev=-1,max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            max=Math.max(f[ch],max);
            if(max==i){
                ans.add(max-prev);
                prev=i;
            }
        }
        return ans;
    }
}