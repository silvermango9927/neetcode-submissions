class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int l = nums.length;

        for (int num: nums) {
            minHeap.offer(num);
        }

        for(int i = 0; i < l - k; i++) {
            minHeap.poll();
        }

        return minHeap.peek();
    }
}
