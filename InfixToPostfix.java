package Single;

import java.util.*;

public class InfixToPostfix {
	Stack<String> stack = new Stack<String>();

	// Stack<String>postfix=new Stack<String>();

	
	Boolean checkParenthesis(String infix)
	{
		
		char paren[]=infix.toCharArray();
		int out=0,in=0;
		for(int i=0;i<paren.length;i++)
		{
			if(paren[i]=='(')
			{
				in++;
			}
			if(paren[i]==')')
			{
				out++;
			}
		}
		if(out==in)
		{
			return true;
			
		}
		else
		{
			return false;
		}
		
	}
	String infixToPostfix(String infix) {
		String postfix = "";
		try {

			for (int i = 0; i < infix.length(); i++) {
				char op = infix.charAt(i);

				switch (op) {
				case '(':
					String in = Character.toString(op);

					stack.push(in);

					break;
				case ')':
					int f = 0;
					while (f == 0) {
						String inf = stack.peek();

						stack.pop();

						if (inf.equals("(")) {

							f = 1;

						} else {
							postfix = postfix + inf;

						}
					}

					break;
				case '+':
				case '-':
				case '*':
				case '/':
					String el;
					String element = stack.peek();

					char op1 = element.charAt(0);

					while (precedence(op1) >= precedence(op)) {

						stack.pop();

						postfix = postfix + element;

						el = stack.peek();

						op1 = el.charAt(0);
					}

					in = Character.toString(op);

					stack.push(in);

					break;
				default:
					in = Character.toString(op);
					postfix = postfix + in;

					break;

				}

			}
		} catch (NullPointerException e) {
			System.out.println("Exception");
		}
		return postfix;
	}

	int precedence(char op) {
		switch (op) {
		case '(':
			return 0;
		case '%':
			return 3;
		case '/':
			return 3;
		case '*':
			return 3;
		case '+':
			return 2;
		case '-':
			return 2;
		default:
			return -1;
		}
	}

	public static void main(String args[]) {

		InfixToPostfix post = new InfixToPostfix();
		System.out.println("Enter infix expression");
		Scanner sc = new Scanner(System.in);
		String infix = sc.next();
		infix = "(" + infix + ")";
        Boolean b=post.checkParenthesis(infix);
        if(b==false)
        {
        	System.out.println("Invalid string should be equality of parenthesis");
        }
        else
        {
		System.out.println(infix);
		System.out.println(post.infixToPostfix(infix));
        }

	}

}
