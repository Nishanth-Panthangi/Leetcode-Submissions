class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] outputList = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j< nums.length; j++){
                if(i==j){
                    continue;
                }
                if(nums[i]+nums[j]==target){
                    outputList[0]=i;
                    outputList[1]=j;
                    break;
                }
            }
        }
        return outputList;
    }
}
