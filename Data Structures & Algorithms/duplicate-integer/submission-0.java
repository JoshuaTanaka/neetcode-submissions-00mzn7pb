class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dup = new HashSet<>();
        for(int x: nums){
            if(dup.contains(x)){
                return true;
            } else {
                dup.add(x);
            }
        }
        return false;

    }
}