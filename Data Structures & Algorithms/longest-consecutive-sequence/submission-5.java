class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        if(nums.length == 0){
            return 0;
        } else if(nums.length == 1){
            return 1;
        }
        int max = 1;
        int counter = 1;
        for (int i =0; i< nums.length-1; i++){
            if (nums[i+1]-1 == nums[i]){
                counter ++;
            } else if (nums[i+1] != nums[i]){
                if(counter > max){
                    max = counter;
                }
                counter = 1;
            }
        }

        return (max > counter)? max: counter;
    }
}
