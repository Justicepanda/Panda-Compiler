package parser;

import java.util.Stack;

import scanner.Token;
import scanner.TokenType;

public class ParsingStack
{	
	Stack<Token> stack;
	
	public ParsingStack()
	{
		stack = new Stack<Token>();
		stack.push(new Token(TokenType.EXIT, "$"));
		stack.push(new Token(TokenType.NONTERM, "<START>"));
	}
	
	public void push(Rule rule)
	{
		for(int i = rule.getTokens().length - 1; i >= 0; i--)
		{
			stack.push(rule.getTokens()[i]);
		}
	}
	
	public Token peek()
	{
		return stack.peek();
	}
	
	public Token pop()
	{
		return stack.pop();
	}
}
