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
public class BurgerStrategyDemo {
    
    public static void main(String[] args) {
        
        //make our client
        Burger burger;
        
        //cheeseburger. bread bun
        burger = new Burger(new CheeseburgerPatty(), new BreadBun());
        System.out.println("");
        
        //protein style
        burger = new Burger(new CheeseburgerPatty(), new ProteinBun());
        System.out.println("");
        
        //chicken burgerm, bread bun
        burger = new Burger(new ChickenPatty(), new ProteinBun());
        System.out.println("");
        
        //chicken and lettuce. nice
        burger = new Burger(new VeggiePatty(), new ProteinBun());
        System.out.println("");
    }
    
}
