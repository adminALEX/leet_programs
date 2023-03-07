class Solution {
    public int minFlips(String target) {
        int count=0;
        char c = '0';
        int len = target.length();
        for(int i=0;i<len;i++){
            if(target.charAt(i) == c)
                continue;
            count++;
            c = c=='0'?'1':'0';
        }
        return count; 
    }
}