class Solution {
    public int getWater(int l, int r, int[] heights) {
            return (r - l) * Math.min(heights[r], heights[l]);        
    }
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int res = 0;
        
        while(l < r) {
            res = Math.max(getWater(l, r, heights), res);
            if(heights[l] < heights[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        return res;
    }
}
