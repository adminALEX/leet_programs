class Solution {
    public String addBinary(String a, String b) throws StringIndexOutOfBoundsException {
            int a_len = a.length();
            int b_len = b.length();
            String res="";
            int remain = 0;
            if(a_len>b_len) b = addZeros(b, b_len, a_len);
            else if(a_len<b_len) a = addZeros(a, a_len, b_len);
            a_len = a.length()-1;
            b_len = b.length()-1;
            while(a_len>=0 && b_len>=0){
                
                if(a.charAt(a_len) == '1' && b.charAt(b_len) == '1'){
                    if(remain == 1)
                        res = "1" + res;
                    else
                        res = "0" + res;
                    remain = 1;
                }
                else if(a.charAt(a_len) == '0' && b.charAt(b_len) == '0'){
                    res = String.valueOf(remain) + res;
                    remain = 0;
                }
                else{
                    if(remain == 1){
                        remain = 1;
                        res = "0" + res; 
                    }
                    else{
                        remain = 0;
                        res = "1" + res;
                    }
                }
                a_len--;
                b_len--;
            }
            if(remain!=0) res = "1"+res;
            return res;
        }
        static String addZeros(String s, int current, int target){
            if(current == target) return s;
            else return addZeros("0"+s, current+1, target);
            
        }
}