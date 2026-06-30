class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int last = nums.length - 1;
        prefix[0] = nums[0];
        for(int i = 1; i<nums.length; i++) {
            prefix[i] = prefix[i-1]*nums[i];
        }
        suffix[last] = nums[last];
        for(int i = last-1; i>=0; i--) {
            suffix[i] = nums[i]*suffix[i+1];
        }

        int[] res = new int[nums.length];
        for(int i = 0; i < last+1; i++) {
            if (i == 0) {
                res[i] = suffix[1];
            } else if (i == last) {
                res[i] = prefix[last - 1]; 
            } else {
                res[i] = prefix[i - 1] * suffix[i + 1]; 
            }
        }
        return res;
    }
}  
