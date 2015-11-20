/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken;

import janken.Janken.Hand;

/**
 *
 * @author b2130480
 */
public abstract class AbstractJankenActor extends AbstractActor{
    
    Hand hand;
    public void setHand(Hand h){
        hand = h;
    }
    
    public Hand getHand(){
        return hand;
    }
    
}
