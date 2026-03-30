class Solution {
    public int trap(int[] height) {
        int answer = 0;
        for(int i =0; i < height.length; i++){
            int maxLeft = height[i];
            int maxRight = height[i];
            for(int j =0; j < i; j++){
                maxLeft = Math.max(maxLeft,height[j]);
            }
            for(int k =i+1; k < height.length; k++){
                maxRight = Math.max(maxRight,height[k]);
            }
            answer += Math.min(maxRight,maxLeft)-height[i];
        }
        return answer;
    }
}
