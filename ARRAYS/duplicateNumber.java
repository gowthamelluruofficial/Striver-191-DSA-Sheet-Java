class Solution {
    public int count(int[] nums, int val){
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n; i++){
            if(nums[i]<=val) count++;
        }
        return count;
    }
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        while(l<r){
            int mid = l+(r-l)/2;
            if(count(nums,mid)>mid){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}


class Solution {
    public int findDuplicate(int[] nums){
        int n = nums.length;
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        
        slow = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
