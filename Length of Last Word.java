class Solution {
    public int lengthOfLastWord(String s) {
         int i=s.length()-1;
        int length=0;
        
        while(i>=0){
            if(s.charAt(i) !=' ')
                length++;
            else{
                if(length >0)
                    return length;
            }
            i--;
        }
        
        return length;
        
    }
