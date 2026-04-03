class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int tempSize =0;
        HashSet<Character> window = new HashSet<>();
        int left = 0;
        int right = 0;
        while(right < s.length()){
            while(right< s.length() && !window.contains(s.charAt(right))){
                window.add(s.charAt(right));
                tempSize ++;

                max = Math.max(max,tempSize);
                right ++;
            }
            while(left < right && right< s.length() && window.contains(s.charAt(right))){
                window.remove(s.charAt(left));
                tempSize --;
                left ++;
            }
        }
        return max;

    }
}
