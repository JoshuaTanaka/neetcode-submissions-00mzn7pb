class Solution {
    public int maxArea(int[] heights) {
        //two pointers
        //store max then go through each combo and get area
        int max = 0;
        for(int i =0; i < heights.length;i++){
            for(int j=i+1; j < heights.length; j++){
                int minHeight = Math.min(heights[i],heights[j]);
                max = Math.max(max, minHeight*(j-i));
            }
        }
        return max;
    }
}
