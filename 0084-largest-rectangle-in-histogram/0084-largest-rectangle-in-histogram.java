class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> stack = new Stack<>();
        int max = 0;
        int[] arr = new int[heights.length+1];
        for(int i=0;i<heights.length;i++){
            arr[i]=heights[i];
        }
        arr[heights.length]=0;

        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[i]<arr[stack.peek()]){
                int index=stack.pop();
                int height=arr[index];
                int right=i;
                int left=(stack.isEmpty() ? -1 : stack.peek());
                int width=right-left-1;
                int area=height*width;
                max=Math.max(max, area);
            }
            stack.push(i);
        }
        return max;
    }
}