class Solution {
    public boolean isValid(String st) {
        Stack<Character> s = new Stack<>();
         if(st.length() == 0 || st.length() == 1) return false;
        for(char c : st.toCharArray()){
            if(c == '{' || c == '(' || c == '['){
                s.push(c);
                continue;
            }
            else if(c == '}'){
                if(s.isEmpty() || s.pop() != '{') return false;
            }
            else if(c == ')'){
                if(s.isEmpty() || s.pop() != '(') return false;
            }
            else if(c == ']'){
                if(s.isEmpty() || s.pop() != '[') return false;
            }
        }
        return s.isEmpty();
    }
}