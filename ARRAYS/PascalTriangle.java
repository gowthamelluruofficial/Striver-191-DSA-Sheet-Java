class Solution {
    public int pascalTriangleI(int r, int c) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1; i<=r; i++){
            List<Integer> res = new ArrayList<>();
            if(i!=1) res.add(1);
            for(int j=1; j<i-1; j++){
                if(ans.size()>1){
                    res.add(ans.get(i-2).get(j-1)+ans.get(i-2).get(j));
                }
            }
            res.add(1);
            ans.add(res);
        }
        int n = ans.size();
        return ans.get(n-1).get(c-1);
    }
}
