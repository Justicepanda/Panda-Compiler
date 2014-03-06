package parser;

import java.util.HashMap;
import java.util.Map;

public class RuleTable 
{
	private HashMap<Integer, Rule> rules;
	private int size;
	
	public RuleTable()
	{
		rules = new HashMap<Integer, Rule>();
		size = 0;
	}
	
	public void addRule(String rule)
	{
		rules.put(size++, new Rule(rule));
	}
	
	public Rule getRule(int index)
	{
		return rules.get(Integer.valueOf(index));
	}
}
