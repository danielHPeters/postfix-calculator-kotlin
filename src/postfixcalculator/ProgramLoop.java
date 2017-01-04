package postfixcalculator;

/**
 *
 * @author d.peters
 */
public class ProgramLoop {
    
    /**
     * Boolean flag for starting and ending the loop
     */
    private boolean running;
    
    /**
     * Default constructor.
     */
    public ProgramLoop(){
        this.running = true;
    }
    
    /**
     * The loop listening for user input
     */
    public void loop(){

        while(this.running){
            
        }
    }
    
    /**
     * Method for ending the program loop
     */
    public void end(){
        this.running = false;
    }
    
}
