class Solution {
    public int bin_search(int l, int r, int[] nums, int target) {
        if(l > r) {
            return -1;
        }
        int m = l + (r-l)/2;
        if(nums[m]==target) return m;
        return (nums[m]>target) ?
            bin_search(l, m-1, nums, target) :
            bin_search(m+1, r, nums, target);
    }
    public int search(int[] nums, int target) {
        return bin_search(0, nums.length - 1, nums, target);
    }
}
