class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // naive solution would be to iterate twice through the array leading to a O(n^2) time complexity but we want it much faster
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i<numbers.length; i++) {
        //     int tmp = target - numbers[i];
        //     if(map.containsKey(tmp)) {
        //         return new int[]{map.get(tmp) , i+1};
        //     }
        //     map.put(numbers[i], i+1);
        // }
        // return null;

        // editing to use two pointers to reduce the space complexity
        int l = 0;
        int r = numbers.length - 1;

        while(l<r) {
            int sum = numbers[l]+numbers[r];
            if(sum> target) {
                r=r-1;
            }
            if(sum< target) {
                l=l+1;
            }
            if(sum== target) {
                return new int[]{l+1, r+1};
            }
        }
        return null;
    }
}
