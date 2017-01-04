package postfixcalculator;

import java.util.Scanner;

/**
 *
 * @author d.peters
 */
public class PostFixCalculator {

    /**
     * Scanner object for reading userinput from console
     */
    private Scanner input;
    
    /**
     * 
     */
    private PostFixConverter converter;
    
    /**
     * 
     */
    private PostFixExpressionParser parser;
    
    /**
     * Default constructor
     */
    public PostFixCalculator(){
        
        this.input = new Scanner(System.in);
        this.converter = new PostFixConverter(input);
        this.parser = new PostFixExpressionParser();
        
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
