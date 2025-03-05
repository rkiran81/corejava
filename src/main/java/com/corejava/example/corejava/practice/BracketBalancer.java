package com.corejava.example.corejava.practice;

import java.util.Stack;

public class BracketBalancer {
	
	/*
	 * Balanced : (),[]{},({[]}),([]{}),
	 * Unbalanced:({[}),([)],{{[[(())]]}},([
	 */
	
	 public static void main(String[] args) {
	        String input = "{[()]}";//{ [ ( } ) ]
	        if (isBalanced("{ [ ( } ) ]")) {
	            System.out.println("The brackets are balanced.");
	        } else {
	            System.out.println("The brackets are not balanced.");
	        }
	    }
	 
	 
	 private static boolean isBalanced1(String input) {
		
		 Stack<Character> stack = new Stack<>();
		 
		 char[] brackets = input.toCharArray();
		 for(char bracket : brackets) {
			 if( ('(' == bracket || '{' == bracket || '[' == bracket) )
			 {
				 stack.push(bracket);
			 }else if( (')' == bracket || '}' == bracket || ']' == bracket) )
			 {
				 if(stack.isEmpty()) {
					 return false;
				 }
				 
//				 int indexOf = stack.indexOf(bracket);
				 
				 if(!isOpenCloseBracketMatch(stack.pop(), bracket)){
					 return false;
				 }
			 } 
		 }
		 
		return stack.isEmpty();
	}
	 
//	public static boolean isOpenBracketExists(Character close, Stack stack) {
//		Character openBracket = getMatchingOpeningBracket(close);
//		int indexOf = stack.indexOf(openBracket);
//		if(indexOf == -1) {
//			return false;
		//}		//stack.remove(indexOf);
//
//		return stack.remove(indexOf) == openBracket;
//	}
//	
//	public static Character getMatchingOpeningBracket(Character close) {
//		return ')' == close ? '(' : ( '}' == close ? '{' : '[') ;
//	}


	public static boolean isOpenCloseBracketMatch(Character open, Character close) {
		 return (
				 ('(' == open && ')' == close) ||
				 ('{' == open && '}' == close) ||
				 ('[' == open && ']' == close)
				 );
	 }
	 
	 
	 
	
    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char openBracket = stack.pop();
                if (!isMatchingPair(openBracket, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char openBracket, char closeBracket) {
        return (openBracket == '(' && closeBracket == ')') ||
               (openBracket == '{' && closeBracket == '}') ||
               (openBracket == '[' && closeBracket == ']');
    }

   
}

