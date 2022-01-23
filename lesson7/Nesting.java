import java.util.*;
class Solution {
    public int solution(String S) {
        // write your code in Java SE 8

        List<Character> stack = new ArrayList<>();
        int sLength = S.length();

        for(int i = 0; i < sLength;i++){
            char ch = S.charAt(i);
            if(ch == '('){
                stack.add(0,ch);
            }else{
                if(stack.size() == 0)
                    return 0;
                stack.remove(0);
            }
        }

        return stack.size() == 0 ? 1 : 0;
    }
}