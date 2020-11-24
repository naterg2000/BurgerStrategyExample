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
public class ChickenPatty implements PattyStrategy {
    
    public ChickenPatty() {
        getPattyType();
    }
    
    @Override
    public void getPattyType() {
        System.out.println("grilled chicken patty");
    }
    
}
