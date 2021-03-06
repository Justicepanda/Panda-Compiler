package scanner;

import java.util.List;

public class TokenDfa extends Dfa 
{
	  private String currValue;
	
	  public TokenDfa(List<State> states) 
	  {
	    super(states);
	  }
	
	  protected void adjustValue(String input) 
	  {
	    currValue += input.charAt(0);
	  }
	
	  /**
	   * Returns the current token with any trailing characters removed.
	   */
	  String getStateValue() 
	  {
	    return currValue.substring(0, currValue.length() - 1);
	  }
	
	  public Token getToken() 
	  {
	    return new Token(Token.getTokenType(getStateName()), getStateValue());
	  }
	
	  public boolean isInSpaceState() {
	    return getStateName().equals("SPACE");
	  }
	
	  public boolean isInErrorState() {
	    return getState() == -1;
	  }
	
	  public void resetValue() {
	    currValue = "";
	  }
	
	  public boolean isNotInAcceptState() {
	    return getState() < 0 ||
	            getCurrState().isNotAcceptState() ||
	            isInSpaceState() ||
	            isInErrorState();
	  }
}
