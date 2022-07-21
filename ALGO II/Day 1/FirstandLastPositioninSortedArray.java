class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] tmp = new int[2];
        tmp[0] = firstOccurrence(nums,target);
        tmp[1] = lastOccurrence(nums,target);
        return tmp;
    }

    static int firstOccurrence(int[] arr,int element) {
        int start = 0;
        int end = arr.length-1;
        int index = -1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (element == arr[mid]) {
                index = mid;
                end = mid - 1;
            }
            else if (element < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return index;
    }

    static int lastOccurrence(int[] arr,int element) {
        int start = 0;
        int end = arr.length-1;
        int index = -1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (element == arr[mid]) {
                index = mid;
                start = mid + 1;
            }
            else if (element < arr[mid]) end = mid - 1;
            else start = mid + 1;
        }
        return index;
    }
}