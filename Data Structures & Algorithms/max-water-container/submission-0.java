class Solution {
    public int maxArea(int[] heights) {
        int left = 0 ;
        int right= heights.length-1;
        int result = Integer.MIN_VALUE;
        int left_base = 0 ;
        int right_base = 0 ;
    
        while(left<right){
            int temp = 0;
            int pointerL = heights[left] ;
            int pointerR = heights[right] ;
            
            temp = Math.min(pointerL,pointerR) * (right - left);
            if(result < temp){
                result = temp;
            }
            if(pointerL > pointerR){
                right--;
            }
            else{
                left++;
            }
    
        }
        return result;
    }
}
