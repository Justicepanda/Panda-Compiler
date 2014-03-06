package parser;

import scanner.Token;

public class ParserException extends RuntimeException 
{
	ParserException(String s) 
	{
		super(s);
	}
}

class TerminalException extends ParserException 
{
	public TerminalException(Token actual, Token expected) 
	{
		super("\"" + actual.getValue() + "\" is not a valid token. Expected \"" + expected.getValue() + "\".");
	}
}

class NonTerminalException extends ParserException 
{
	public NonTerminalException(String expected) 
	{
		super(expected);
	}
}