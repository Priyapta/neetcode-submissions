class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pointerLeft = 0 ;
        int pointerRight = numbers.length-1;
        while (numbers[pointerLeft] + numbers[pointerRight] != target){
            if(numbers[pointerLeft] + numbers[pointerRight] > target){
                pointerRight--;
            }
            else{
                pointerLeft++;
            }
        }
        return new int[]{pointerLeft + 1, pointerRight + 1};
    }
}
