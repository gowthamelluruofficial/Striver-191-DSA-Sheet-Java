class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int majority_Element = nums[0];
        for(int i=0; i<n; i++){
            if(count==0){
                majority_Element = nums[i];
            }
            if(nums[i]==majority_Element) count++;
            else count--;
        }
        return majority_Element;
    }
}
