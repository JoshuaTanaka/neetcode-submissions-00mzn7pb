class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        List<List<Integer>> answer = new ArrayList<>();

        for(int i = 0; i < nums.length; i ++){
            if(nums[i]>0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i+1, k = nums.length-1;

            while(j< k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0){
                    j++;
                } else if (sum > 0) {
                    k--;
                }else if(sum == 0){
                    answer.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    j++;k--;
                    while(j < k && nums[j] == nums[j-1]){
                        j++;
                    }
                }
            }
        }

        return new ArrayList<>(answer);
    }
}
