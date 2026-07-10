class Solution {
    public int findDuplicate(int[] nums) {
        // Set<Integer> set = new HashSet<>();
        // for (int num: nums) {
        //     if(set.contains(num)) {
        //         return num;
        //     }
        //     set.add(num);
        // }

        // return -1;

        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];          // Moves 1 step
            fast = nums[nums[fast]];    // Moves 2 steps
        } while (slow != fast);
        int slow2 = 0;
        while(slow != slow2) {
            slow = nums[slow];
            slow2 = nums[slow2];
        }

        return slow;
    }
}
