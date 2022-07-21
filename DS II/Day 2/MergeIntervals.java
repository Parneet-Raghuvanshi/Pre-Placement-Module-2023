class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0) return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        LinkedList<int[]> res = new LinkedList<>();
        for(int[] curr : intervals) {
            if(res.isEmpty() || res.getLast()[1] < curr[0]) {
                res.add(curr);
            }
            else {
                res.getLast()[1] = Math.max(res.getLast()[1], curr[1]);
            }
        }
        return res.toArray(new int[0][]);
    }
}