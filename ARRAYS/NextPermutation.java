class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;
        for(int i=n-1; i>0; i--){
            if(nums[i]>nums[i-1]){
                pivot = i-1;
                break;
            }
        }
        if(pivot == -1){
            reverse(0, n-1, nums);
            return;
        }
        int idx = -1;
        for(int i = n - 1; i > pivot; i--){
            if(nums[i] > nums[pivot]){
                idx = i;
                break;
            }
        }
        int temp = nums[pivot];
        nums[pivot] = nums[idx];
        nums[idx] = temp;
        reverse(pivot+1,n-1,nums);
    }
    public void reverse(int l, int r, int[] nums){
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}
