class Solution {
    public int[] searchRange(int[] nums, int t) {
        int[] res = new int[]{-1,-1};
        int first,last;
        Boolean found = false;
        for(int i=0;i<nums.length ; i++){
            first = i;
            last = i;
            if(found && nums[i] != t) return res;
            if(nums[i] == t && !found){
                found = true;
                res[0] = first;
                res[1] = last;
                continue;
            }
            if(nums[i] == t && found){
                res[1] = last;
            }
        }
        return res;
   }
}