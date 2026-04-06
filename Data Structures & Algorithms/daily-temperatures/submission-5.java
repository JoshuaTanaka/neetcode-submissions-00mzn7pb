class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //reverse looking into array
        //is 28 > 40, no so pop and push 40
        // 35 < 40 push 40, 35
        //36 > 35? yes pop and push 
        int size = temperatures.length;
        int[] answer = new int[size];
        Stack<int[]> stack = new Stack<>();
        for(int i=0; i < size; i ++){
            while(!stack.isEmpty() && temperatures[i]>stack.peek()[0]){
                int[] temp = stack.pop();
                answer[temp[1]] = i - temp[1];
            } 
                stack.push(new int[]{temperatures[i], i});
        }
        return answer;
    }
}
