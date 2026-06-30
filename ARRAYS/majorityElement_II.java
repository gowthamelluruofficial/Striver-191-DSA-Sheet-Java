class Solution {
    public List<Integer> majorityElementTwo(int[] nums) {
        int n = nums.length;
        int e1 = Integer.MIN_VALUE;
        int e2 = Integer.MIN_VALUE;
        int c1 = 0;
        int c2 = 0;
        for(int i=0; i<n; i++){
            if(c1==0 && nums[i]!=e2){
                e1 = nums[i]; 
                c1 = 1;
            } 
            else if(c2==0 && nums[i]!=e1){
                e2 = nums[i]; 
                c2 = 1;
            } 
            else if(nums[i]==e1) c1++;
            else if(nums[i]==e2) c2++;
            else{
                c1--;
                c2--;
            }
        }
        int v1 = 0;
        int v2 = 0;
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(nums[i]==e1) v1++;
            else if(nums[i]==e2) v2++;
        }
        int min = n/3;
        if(v1>min) ans.add(e1);
        if(v2>min) ans.add(e2);
        return ans;
    }
}
