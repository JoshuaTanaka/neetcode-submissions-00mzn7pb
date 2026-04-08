class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pair = new int[position.length][2];
        for(int i =0; i < position.length; i++){
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a,b) -> Integer.compare(b[0],a[0]));
        Stack<Double> stack = new Stack<>();
        //7 -> 3, 4 -> 3, 1-> 4, 0 -> 10
        for(int[] car: pair){
            double time = ((double)(target-car[0])/car[1]);
            stack.push(time);

            if(stack.size() > 1 && time <= stack.get(stack.size()-2)){
            System.out.println(time);
                stack.pop();
            } 
        }

        return stack.size();
    }
}
