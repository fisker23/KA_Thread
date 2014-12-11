/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ka_thread;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Andreas Fisker
 */
public class BoatCreator {
   private ArrayList<Boat> blnord = new ArrayList<Boat>();
   private ArrayList<Boat> blsyd = new ArrayList<Boat>();
    Random r = new Random();
    Boat b;

    public BoatCreator(ArrayList<Boat> blsyd, ArrayList<Boat> blnord) {
        this.blsyd = blsyd;
        this.blnord = blnord;
    }
    
    public void CreateBoats(int antal){
        for (int i = 0; i < antal; i++) {
            if(r.nextBoolean() ==true){
                b = new Boat(true);
                blnord.add(b);
                System.out.println("Northway boat");
                
            } else{
                b = new Boat(false);
                System.out.println("Southwayboat");
                blsyd.add(b);
            }
        }
    }

    public ArrayList<Boat> getBlnord() {
        return blnord;
    }

    public ArrayList<Boat> getBlsyd() {
        return blsyd;
    }
    
}
