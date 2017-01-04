package postfixcalculator;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author d.peters
 */
public class PostFixConverter {

    /**
     * Reference to the Scanner object
     */
    private Scanner input;

    /**
     * Container for the user submitted math expresseion.
     */
    private String inputExpression;

    /**
     * Container for the postfix expression to be generated
     */
    private String postFixExpression;

    /**
     * The to temporarily save the Operators
     */
    private Stack operators;

    /**
     * Default constructor.
     * 
     * @param input 
     */
    public PostFixConverter(Scanner input) {

        this.input = input;

    }

}
