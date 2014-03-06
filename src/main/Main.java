package main;

import scanner.Scanner;
import parser.Parser;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner();
		Parser parser = new Parser(scanner);
		
		if(parser.Parse())
			System.out.println("Panda-Compiler: Parsing successful." );
	}
}
