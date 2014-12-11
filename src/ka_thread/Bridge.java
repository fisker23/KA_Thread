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
public class Bridge {
    boolean open = false;
 private   ArrayList<Boat> blsyd;
 private   ArrayList<Boat> blnord;
   private int boatnord;
   private int boatsyd;

    public Bridge(ArrayList<Boat> blsyd, ArrayList<Boat> blnord) {
        this.blsyd = blsyd;
        this.blnord = blnord;
    }
    
    public boolean bridgestate(){
        return open;
    }
    public void startbridge(){
        
        open = true;
//        System.out.println(blnord.size());
        boatnord = blnord.size();
        boatsyd = blsyd.size();
        
        while(boatnord>0){
            for (int i = 0; i < blnord.size(); i++) {
                
            System.out.println(blnord.get(i)+" er sejlet igennem");
            blnord.remove(i);
            }
        }
            while(boatnord ==0 && boatsyd>0){
                for (int i = 0; blsyd.size() < 10; i++) {
                    System.out.println(blsyd.get(i) +" er sejlet igennem");
                blsyd.remove(i);
                }
            }
        
        
        
    }
    
}
