package burgerstrategyexamplecode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nater
 */
public class CheeseburgerPatty implements PattyStrategy {
    
    public CheeseburgerPatty() {
        getPattyType();
    }
    
    @Override
    public void getPattyType() {
        System.out.println("beef patty + cheese");
    }
    
}
