package postfixcalculator;

/**
 * Parser for postfix expressions
 *
 * @author d.peters
 */
public class PostFixExpressionParser {
    
    /**
     * Container for the postfix expression to be parsed
     */
    private String postFixExpression;
    
    /**
     * Default constructor.
     * 
     */
    public PostFixExpressionParser(){
        
    }

    /**
     * Setter for postFixExpression
     * @param postFixExpression 
     */
    public void setPostFixExpression(String postFixExpression) {
        this.postFixExpression = postFixExpression;
    }
    
}
