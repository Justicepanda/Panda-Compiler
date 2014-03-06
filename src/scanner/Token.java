package scanner;

public class Token 
{
	private TokenType type;
	private String value;
	
	public Token(TokenType type, String value)
	{
		this.type = type;
		this.value = value;
	}
	
	public static TokenType getTokenType(String token)
	{
		if(token.charAt(0) == '<' && token.charAt(token.length() - 1) == '>')
			return TokenType.NONTERM;
		else if(token.equals("["))
			return TokenType.LEFTBRACKET;
		else if(token.equals("]"))
			return TokenType.RIGHTBRACKET;
		else if(token.equals("{"))
			return TokenType.LEFTCURLY;
		else if(token.equals("}"))
			return TokenType.RIGHTCURLY;
		else if(token.equals(","))
			return TokenType.COMMA;
		else if(token.equals(":"))
			return TokenType.COLON;
		else if(token.equals(";"))
			return TokenType.SEMICOLON;
		else if(token.equals("("))
			return TokenType.LEFTPAREN;
		else if(token.equals(")"))
			return TokenType.RIGHTPAREN;
		else if(token.equals("&"))
			return TokenType.AND;
		else if(token.equals("|"))
			return TokenType.OR;
		else if(token.equals("*"))
			return TokenType.MULT;
		else if(token.equals("/"))
			return TokenType.DIV;
		else if(token.equals("+"))
			return TokenType.ADD;
		else if(token.equals("-"))
			return TokenType.MINUS;
		else if(token.equals("%"))
			return TokenType.MOD;
		else if(token.equals("=="))
			return TokenType.EQUAL;
		else if(token.equals("<"))
			return TokenType.LESSER;
		else if(token.equals(">"))
			return TokenType.GREATER;
		else if(token.equals("<="))
			return TokenType.LESSEQ;
		else if(token.equals(">="))
			return TokenType.GREATEQ;
		else if(token.equals("!="))
			return TokenType.NOTEQUAL;
		else if(token.equals("="))
			return TokenType.ASSIGN;
		else if(token.equals("\""))
			return TokenType.DOUBLETICK;
		else if(token.equals("'"))
			return TokenType.SINGLETICK;
		else if(token.equals("."))
			return TokenType.PERIOD;
		else if(token.equals("\\\\"))
			return TokenType.COMMENTS;
		else if(token.equals("$"))
			return TokenType.EXIT;
		else if(token.equals("NULL"))
			return TokenType.NULL;
		else
			return TokenType.NONE;
	}
	
	public String getValue()
	{
		return value;
	}
	
	public TokenType getType()
	{
		return type;
	}
}