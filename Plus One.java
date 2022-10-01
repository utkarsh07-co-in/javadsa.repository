class Solution {
    public int[] plusOne(int[] digits) {
           int carry=1,val=0;
        
        for(int i=digits.length-1;i>=0;i--){
            val=((digits[i]+carry)%10);
            carry=((digits[i]+carry)/10);
            digits[i]=val;
        }
        
        if(carry==0){
            return digits;
        }else{
            int[] temp=new int[digits.length+1];
            temp[0]=carry;
            for(int i=0;i<digits.length;i++){
                temp[i+1]=digits[i];
            }
            
            return temp;
            
        }
    }
}
