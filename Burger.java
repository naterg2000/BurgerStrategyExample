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
public class Burger {
    
    private PattyStrategy patty;
    private BunStrategy bun;
    
    //a burger has two components, a patty and a bun
    public Burger(PattyStrategy p, BunStrategy b) {
        
        this.patty = p;
        this.bun = b;
        
    }
    
}
