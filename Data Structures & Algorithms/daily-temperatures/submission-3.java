class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        int right =0;
        for(int left = 0; left < temperatures.length; left++){
            int count = 0;
            right = left;
            while(right<temperatures.length){
                System.out.println(left+ " " + right);

                if(temperatures[right]>temperatures[left]){
                    answer[left] = count;
                    break;
                } else {
                    count ++;
                }
                right ++;
            }
        }
        return answer;
    }
}
