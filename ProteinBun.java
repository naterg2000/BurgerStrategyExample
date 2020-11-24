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
public class ProteinBun implements BunStrategy {
    
    public ProteinBun() {
        getBunType();
    }
    
    @Override
    public void getBunType() {
        System.out.println("lettuce bun");
    }
    
}
