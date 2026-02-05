class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") ||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int op1,op2;
                op2=s.pop();
                op1=s.pop();
                switch(tokens[i]){
                    case "+":
                        s.push(op1+op2);
                        break;
                    case "-":
                        s.push(op1-op2);
                        break;
                    case "*":
                        s.push(op1*op2);
                        break;
                    case "/":
                        s.push(op1/op2);
                        break;
                }
            }
            else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
    
}