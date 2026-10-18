class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> stack = new Stack<>();
        for(String i : tokens){
            if(i.equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                int c = a+b;
                stack.push(c);
            }else if(i.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                int c = a-b;
                stack.push(c);
            }else if(i.equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                int c = a*b;
                stack.push(c);
            }else if(i.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                int c = a/b;
                stack.push(c);
            }else{
                stack.push(Integer.parseInt(i));
            }
        }
        return stack.peek();
    }
}