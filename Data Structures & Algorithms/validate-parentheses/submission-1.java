class Solution {
    public boolean isValid(String s) {
        //2 HashSets, opening and closing
        //loop through the whole string
        //If opening, push
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && map.containsKey(c) && map.get(c) == stack.peek()){
                stack.pop();
            } else {        
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
