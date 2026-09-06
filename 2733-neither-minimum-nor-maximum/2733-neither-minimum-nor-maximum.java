class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int s=0;
        if(n<=2){
            return -1;
        } else {
          s=nums[1];
          return s;
        }
      
    }
}