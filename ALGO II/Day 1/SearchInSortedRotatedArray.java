class Solution {
    public int search(int[] nums, int target) {
        int index = searchMin(nums);
        if (index==0) {
            int pos = Arrays.binarySearch(nums,0,nums.length,target);
            if (pos<=-1) return -1;
            return pos;
        }
        else {
            int pos1 = Arrays.binarySearch(nums,0,index,target);
            if (pos1<=-1){
                int pos2 = Arrays.binarySearch(nums,index,nums.length,target);
                if (pos2<=-1) return -1;
                return pos2;
            }
            return pos1;
        }
    }

    static int searchMin(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] <= arr[end]) return 0;
        while (start <= end) {
            int mid = start + (end-start)/2;
            int prev = arr[(mid+n-1)%n];
            int next = arr[(mid+1)%n];
            if(arr[mid] <= prev && arr[mid] <= next) return mid;
            if (arr[start] <= arr[mid] && arr[mid] >= arr[end]) start = mid + 1;
            else end = mid - 1;
        }
        return 0;
    }
}