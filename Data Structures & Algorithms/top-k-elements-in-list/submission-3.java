class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // some kind of counting sort algorithm
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        map.forEach((num, count) -> {
            maxHeap.offer(num);
        });

        int[] ke = new int[k];
        for (int j = 0; j<k; j++) {
            ke[j] = maxHeap.poll();
        }

        return ke;





    }
}
