class Solution {
    public String reverseVowels(String s) {
        int start=0;
        int end = s.length()-1;
        while(start<end){
            char e = s.charAt(end);
            char c = s.charAt(start);
            if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'||c == 'A'||c== 'E'||c == 'I'||c == 'O'||c == 'U'){
                if(e == 'a'||e == 'e'||e == 'i'||e == 'o'||e == 'u'||e == 'A'||e == 'E'||e == 'I'||e == 'O'||e== 'U'){
                    s = swap(s,start,end);
                    start++;
                    end--;
                }
                else end--;
            }
            else start++;
        }
        return s;
    }
    public static String swap(String string, int i, int j) {
      StringBuilder sb = new StringBuilder(string);
      sb.setCharAt(i, string.charAt(j));
      sb.setCharAt(j, string.charAt(i));
      return sb.toString();
   }
}