class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // some kind of counting sort algorithm
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arr.add(new int[]{entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for (int j = 0; j<k; j++) {
            res[j] = arr.get(j)[1];
        }
        return res;





    }
}
