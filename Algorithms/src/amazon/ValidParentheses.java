package amazon;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String parentehsis = "({}{}";
		
		boolean isbal = isbalanced(parentehsis);
		System.out.println(isbal);
	}

	private static boolean isbalanced(String parentehsis) {
		Stack<Character> stck = new Stack<>();
		
		for(char c:parentehsis.toCharArray()) {
			if(c=='(' || c=='[' || c=='{') {
				if(c=='(')stck.push(')');
				if(c=='[')stck.push(']');
				if(c=='{')stck.push('}');
				
			}else {
			
				
				if(!stck.isEmpty() && stck.peek()==c ) {
					stck.pop();
				}else {
					return false;
				}
			}
		}
		if(!stck.isEmpty()) {
			return false;
		}
		return true;
	}

}
