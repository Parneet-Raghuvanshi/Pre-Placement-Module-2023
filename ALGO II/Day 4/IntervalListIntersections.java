class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int a,b,m=firstList.length,n=secondList.length,i;
        List<int[]> ll=new ArrayList<int[]>();
        a=b=i=0;
        while(a<m && b<n){
            int l=Math.max(firstList[a][0],secondList[b][0]);
            int h=Math.min(firstList[a][1],secondList[b][1]);
            if(l<=h)
                ll.add(new int[]{l,h});
            if(firstList[a][1]<secondList[b][1])
                a++;
            else b++;
        }
        return ll.toArray(new int[ll.size()][2]);
    }
}