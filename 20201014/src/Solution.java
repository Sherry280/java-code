
    import java.util.Deque;
import java.util.LinkedList;

    public class Solution {
        public boolean isVaild(String s){
            Deque<Character> stack=new LinkedList<>();


            char[] charArray=s.toCharArray();
            for(char c:charArray) {
                switch (c) {
                    case '(':
                    case '[':
                    case '{':
                        stack.push(c);
                        break;
                    default: {
                        if (stack.isEmpty()) {
                            return false;
                        }
                        char left = stack.pop();
                        if (!compareBracket(left, c)) {
                            return false;
                        }
                    }
                }
            }
            if(stack.isEmpty()){
                return true;
            }else{
                return false;
            }
        }


        private boolean compareBracket(char left,char right){
            if(left=='['&&right==']'){
                return true;
            }
            if(left=='('&&right==')'){
                return true;
            }
            if(left=='{'&&right=='}'){
                return true;
            }
            return false;
        }


        public static void main(String[] args) {
            Solution s=new Solution();
            String sc="{()}[]";
            System.out.println(s.isVaild(sc));
        }



    }
