import java.util.*;

/* Test score %87 */
class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        int strLength = S.length();

        List<Character> openChars = new ArrayList<>();
        openChars.add('(');
        openChars.add('{');
        openChars.add('[');

        List<Character> closeChars = new ArrayList<>();
        closeChars.add(')');
        closeChars.add('}');
        closeChars.add(']');

        List<Character> stack = new ArrayList<>();

        Map<Character,Character> charMatchMap = new HashMap<>();
        charMatchMap.put('}','{');
        charMatchMap.put(')','(');
        charMatchMap.put(']','[');

        for(int i = 0; i < strLength ;i++){
            char ch = S.charAt(i);

            if(openChars.contains(ch)){
                stack.add(0,ch);
            }else{
                if(stack.size() == 0)
                    return 0;
                char enclosingChar = charMatchMap.get(ch);
                char top = stack.get(0);
                stack.remove(0);
                if(enclosingChar != top){
                    return 0;
                }
            }
        }
        return stack.size() == 0 ? 1 : 0;
    }
}