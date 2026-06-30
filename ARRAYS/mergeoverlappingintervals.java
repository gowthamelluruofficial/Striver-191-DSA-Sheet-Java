class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n=intervals.length;
        int i=0;
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        while(i<n){
            ArrayList<Integer> res=new ArrayList<>();
            int start=intervals[i][0];
            int end=intervals[i][1];
            while(i<n-1 && end>=intervals[i+1][0]){
                end=Math.max(end,intervals[i+1][1]);
                i++;
            }
            res.add(start);
            res.add(end);
            ans.add(res);
            i++;
        }
        int m=ans.size();
        int[][] a=new int[m][2];
        for(int k=0;k<m;k++){
            a[k][0]=ans.get(k).get(0);
            a[k][1]=ans.get(k).get(1);
        }
        return a;
    }
}
