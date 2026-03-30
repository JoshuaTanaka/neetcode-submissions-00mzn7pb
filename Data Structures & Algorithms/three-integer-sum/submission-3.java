class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        Set<List<Integer>> answer = new HashSet<>();

        for(int i = 0; i < nums.length; i ++){
            int target = -nums[i];
            int j = i+1, k = nums.length-1;

            while(j< k){
                if (nums[j] + nums[k] < target){
                    j++;
                } else if (nums[j] + nums[k] > target) {
                    k--;
                }else if(nums[j] + nums[k] == target){
                    answer.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    j++;k--;
                }
            }
        }

        return new ArrayList<>(answer);
    }
}
