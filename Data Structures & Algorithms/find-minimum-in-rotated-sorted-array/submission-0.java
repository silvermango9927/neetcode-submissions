class Solution {
    public int findMin(int[] nums) {
        // you can do it in O(n log n) first, by just sorting and then doing it
        //need to somehow use binary search
        int l = 0;
        int r = nums.length - 1;
        

        while(l < r) {
            int mid = (l + r)/2;
            if(nums[mid] < nums[r]) {
                r = mid;
            }
            else {
                l = mid + 1;
            }
        }

        return nums[l];
        

    }
}
