import java.util.*;

class Solution2 {
    public boolean isValid(String s) {
        while(s.contains("()") || s.contains("{}") || s.contains("[]")){

            if(s.contains("()")){
                s=s.replace("()","");
            }
            else if(s.contains("[]")){
                s=s.replace("[]","");
            }
            else if(s.contains("{}")){
                s=s.replace("{}","");
            }
        }

        return s.equals("");
    }
}