class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums2);
        List<Integer> numsT =  Arrays.stream(nums2).boxed().collect(Collectors.toList());
        for (Integer num : nums1) {
            int index = binarySearch(numsT, num);
            if (index != -1) {
                ans.add(num);
                numsT.remove(index);
            }
        }
        int i = 0;
        int[] result = new int[ans.size()];
        for (Integer num : ans) result[i++] = num;
        return result;
    }

    static public int binarySearch(List<Integer> nums, int target) {
        int start = 0;
        int end = nums.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums.get(mid)) return mid;
            if (target < nums.get(mid)) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
}