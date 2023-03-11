class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=1;i<=k;i++)
        {
            nums[0]=(-1)*nums[0];
            Arrays.sort(nums);
            
        }
       int sum=0;
        for(int i:nums)
        sum=sum+i;
        
    return sum;
    }
}