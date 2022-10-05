//// Remove Outermost Parentheses

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
                      // Your code here

		// (()())(())

		// ((())())()(())

		//  result = (())()()

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int length = s.length();

		// solution 1 using count
		// int counter = 0;
		// int starting = 0;
		// int i = 0;
		// String res = "";
		// while(i < length) {
		// 	if (s.charAt(i) == '(') {
		// 		counter++;
		// 	} else {
		// 		counter--;
		// 	}
		// 	if (counter == 0) {
		// 		// found valid parenthesis from st to i
		// 		res += s.substring(starting+1, i); // endIndex is exclusive
		// 		starting = i+1;
		// 	}
		// 	i++;
		// }
		// System.out.print(res);

		// 2. using stack... it uses extra space of O(n)
		Stack<Character> stk = new Stack<>();
        int starting = 0;
        String res = "";
        
        int i = 0;
        while(i < s.length()) {
            // process the character
            if (s.charAt(i) == '(') {
                stk.push('(');
            } else {
                stk.pop();
            }
            if (stk.empty()) {
                res += s.substring(starting+1, i);
                starting = i+1;
            }
            i++;
        }
        System.out.print(res);
	}
}



