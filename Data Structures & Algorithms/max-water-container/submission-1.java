class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int p1 = 0, n = heights.length, p2 = n-1;
        while(p1<p2){
            int area = areaCalculator(p1,p2,heights);
            if(heights[p2]>heights[p1]){
                p1++;
            }else{
                p2--;
            }
            max = Math.max(max,area);
        }
        return max;
    }
    int areaCalculator(int p1, int p2, int[] heights){
        return (p2-p1)*Math.min(heights[p2],heights[p1]);
    }
}
