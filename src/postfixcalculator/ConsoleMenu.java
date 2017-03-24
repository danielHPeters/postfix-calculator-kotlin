package postfixcalculator;

import java.util.HashMap;

/**
 * Menu of the Postfix calculator
 * @author d.peters
 */
public class ConsoleMenu implements IMenu{
    
    /**
     * The Menuitems
     */
    private HashMap menuItems;
    
    /**
     * Default constructor.
     * Initializes menu items
     */
    public ConsoleMenu(){
        this.menuItems = new HashMap();
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
