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
public class BreadBun implements BunStrategy {
    
    public BreadBun() {
        getBunType();
    }
    
    @Override
    public void getBunType() {
        System.out.println("bread bun");
    }
    
}
