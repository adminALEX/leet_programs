class Solution {
    public int findNumbers(int[] nums) {
        int i,c=0;
        for(i=0;i<nums.length;i++)
        { if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) ||(nums[i]>99999&&nums[i]<10000000))
             c++;

        }
        return c;
    }
}