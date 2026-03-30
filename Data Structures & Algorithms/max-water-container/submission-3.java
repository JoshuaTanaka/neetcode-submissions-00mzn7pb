class Solution {
    public int maxArea(int[] heights) {
        //2 pointers, left and right
        int max = 0;
        int left = 0, right = heights.length-1;
        while(left < right){
            int width = right - left;
            int minHeight = Math.min(heights[left], heights[right]);
            max = Math.max(minHeight*width,max);
            if(heights[left] <= heights[right]){
                left ++;
            } else {
                right --;
            }
        }
        return max;
    }
}
