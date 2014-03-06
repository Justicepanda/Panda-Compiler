package parser;

import scanner.Token;
import scanner.TokenType;

public class Rule 
{
	private Token[] tokens;
	
	public Rule(String rule)
	{
		String[] tempTokens = rule.split(" ");
		tokens = new Token[tempTokens.length];
		for(int i = 0; i < tokens.length; i++)
		{
			tokens[i] = new Token(Token.getTokenType(tempTokens[i]), tempTokens[i]);
		}
	}
	
	public Token[] getTokens()
	{
		return tokens;
	}
}
