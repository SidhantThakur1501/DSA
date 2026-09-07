class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split(" ");
        String result = "";
        for(int i = word.length - 1 ; i >= 0 ; i--){
            if(!word[i].equals("")){
                if(!result.equals("")){
                    result+=" ";
                }
                result+=word[i];
            }
        }
        return result ;
    }
}