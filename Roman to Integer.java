class Solution {
    public int romanToInt(String s) {
          Map<Character, Integer> map = new HashMap<Character, Integer>() {{
        
            put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
            
        }};
        
        //special situations  
        s = s.replace("IV","IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");
        
        
        int result = 0;
        for (char ch: s.toCharArray()) {
            result+= map.get(ch);
        }
        
        return result;
    }
}
