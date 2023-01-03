class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stc = new Stack<>();
       for(String t: tokens){
           if("+-*/".contains(t)){
               stc.push(evaluate(stc.pop(),stc.pop(),t));
           }
           else
           stc.push(Integer.parseInt(t));
           
       }
       return stc.pop();
    }

    private int evaluate(int b, int a,String op){
        if("+".equals(op)){
            return a+b;
        }
        else if("-".equals(op)){
            return a-b;
        }
        else if("/".equals(op)){
            return a/b;
        }
        else
            return a*b;
    }
}
