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
public class VeggiePatty implements PattyStrategy {
    
    public VeggiePatty() {
        getPattyType();
    }
    
    @Override
    public void getPattyType() {
        System.out.println("veggie patty");
    }
    
}
