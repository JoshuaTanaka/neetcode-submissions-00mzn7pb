class Solution {
    public int largestRectangleArea(int[] heights) {
            //Assume the ith bar is the min, find left and right most where its <=
            Stack<Integer> stack = new Stack<>(); //keeps track of current min
            int[] leftMost = new int[heights.length];
            int[] rightMost = new int[heights.length];
            for(int i =0; i < heights.length; i ++){
                leftMost[i] = -1;
                while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                    stack.pop();
                } 
                
                if(!stack.isEmpty()) {
                    leftMost[i] = stack.peek();
                }
                stack.push(i);
            } // -1, 1 --> 0,0
            stack.clear();
            for(int i =heights.length-1; i >= 0; i --){
                rightMost[i] = heights.length;
                while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                    stack.pop();
                } 
                
                if(!stack.isEmpty()) {
                    rightMost[i] = stack.peek();
                }
                stack.push(i);
            }
            int max = 0;
            for (int i =0; i < leftMost.length; i++){
                leftMost[i] ++;
                rightMost[i] --;
                max = Math.max(max, (rightMost[i] - leftMost[i]+1)*heights[i]);
            }
            return max;

    }
}
