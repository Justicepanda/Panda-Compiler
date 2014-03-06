package parser;

import scanner.Scanner;

public class Parser 
{
	private ParsingTable parsingTable;
	private Scanner scanner;
	
	public Parser(Scanner scanner)
	{
		this.scanner = scanner;
		parsingTable = new ParsingTable();
	}
	
	public boolean Parse()
	{
		try
		{
			return true;
		}
		catch(ParserException e)
		{
			return false;
		}
	}
}
