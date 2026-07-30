class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int maxarea = 0;
        int len = heights.length;

        for(int i = 0; i <= len; i++){
            int currentHeight = (i == len) ? 0 : heights[i];
            while(!stack.isEmpty() && currentHeight < heights[stack.peek()]){
                int height = heights[stack.pop()];

                int width;
                if(stack.isEmpty()){
                    width = i;
                }
                else{
                    width = i - stack.peek() - 1;
                }
                maxarea = Math.max(maxarea, height*width);
            }
            stack.push(i);
        }
        return maxarea;
    }
}

 