class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int max = 0;
        int l=0,r=n-1;
        while(l<r){
                int vol=(r-l)*Math.min(heights[l],heights[r]);
                max=Math.max(vol,max);
                if(heights[l]<heights[r])l++;
                else r--;

        }
        return max;
    }
}
