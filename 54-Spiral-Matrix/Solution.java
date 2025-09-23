import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        String arr[]=s.split("\\s+");
        if(arr.length!=pattern.length()){
            return false;
        }
        
        char chars[]=pattern.toCharArray();
        int i=0;
        for(String st:s.split("\\s+")){
            if(!(map.containsKey(chars[i]))){
                map.put(chars[i],st);
            }
            else{
                if(!(map.get(chars[i]).equals(st))){
                    return false;
                }
            }
            if(!(map2.containsKey(st))){
                map2.put(st,chars[i]);
            }
            else{
                if(!(map2.get(st)==chars[i])){
                    return false;
                }
            }
            i++;     
        }

        for(Character c:map.keySet()){
            if(map2.containsValue(c) && map.containsKey(c)){
                if(c==map2.get(map.get(c)) ){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }

        }
        for(String sc:map2.keySet()){
            if(map.containsValue(sc) && map2.containsKey(sc)){
                if(sc.equals(map.get(map2.get(sc)))){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }

        }

        if(map.size()!=map2.size()){
            return false;
        }
        return true;

        
    }
}