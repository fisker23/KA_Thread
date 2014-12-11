/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ka_thread;

import java.util.ArrayList;

/**
 *
 * @author Andreas Fisker
 */
public class Control {
   public ArrayList<Boat> blsyd = new ArrayList<Boat>();
   public ArrayList<Boat> blnord = new ArrayList<Boat>();
    BoatCreator bc = new BoatCreator(blsyd,blnord);
    Bridge b = new Bridge(blsyd,blnord);
    public Control(){
                
    bc.CreateBoats(10);
        blsyd = bc.getBlsyd();
        blnord = bc.getBlnord();
    b.startbridge();
    
    }
    public static void main(String[] args) {
    new Control();
    }
      
}
