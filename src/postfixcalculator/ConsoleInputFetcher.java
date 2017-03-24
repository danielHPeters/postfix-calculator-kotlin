/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postfixcalculator;

import java.util.Scanner;

/**
 *
 * @author d.peters
 */
public class ConsoleInputFetcher implements IInputFetcher{
    
    /**
     * 
     */
    private Scanner scanner;
    
    /**
     * 
     */
    public ConsoleInputFetcher(){
        this.scanner = new Scanner(System.in);
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String getInput() {
        return this.scanner.nextLine();
    }
    
}
