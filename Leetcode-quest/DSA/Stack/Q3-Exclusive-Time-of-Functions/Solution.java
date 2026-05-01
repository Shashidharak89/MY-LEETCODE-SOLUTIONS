class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int arr[] = new int[n];
        Stack<Integer> st = new Stack<>();
        int prev = 0;

        for (int i = 0; i < logs.size(); i++) {
            int procId = getId(logs.get(i));
            int procState = getType(logs.get(i));
            int procVal = getVal(logs.get(i));

            if (procState == 0) {
                if (!st.empty()) {
                    arr[st.peek()] += procVal - prev;
                }
                st.push(procId);
                prev = procVal;
            } 
            else { 
                arr[st.peek()] += procVal - prev + 1; 
                st.pop();
                prev = procVal + 1;
            }
        }

        return arr;
    }

    int getId(String s){
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ':'){
                temp.append(s.charAt(i));
            }
            else{
                break;
            }
        }
        return Integer.parseInt(temp.toString());
    }

    int getVal(String s){
        String temp = "";
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) != ':'){
                temp = s.charAt(i) + temp;
            }
            else{
                break;
            }
        }
        return Integer.parseInt(temp);
    }

    int getType(String s){
        int i;
        for(i = 0; i < s.length(); i++){
            if(s.charAt(i) == ':'){
                break;
            }
        }
        i++;
        return s.charAt(i) == 's' ? 0 : 1;
    }
}
