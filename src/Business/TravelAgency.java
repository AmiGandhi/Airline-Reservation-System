/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Ami Gandhi
 */
public class TravelAgency {
    
    private ArrayList<Airliner> airDir;
    
    public TravelAgency() {
        airDir = new ArrayList<Airliner>();
    }

    //getter

    public ArrayList<Airliner> getAirDir() {
        return airDir;
    }
    
    //functions
    public Airliner addAirliner() {
        Airliner s = new Airliner();
        airDir.add(s);
        return s;
    }
    
    public void removeAirliner(Airliner a) {
        airDir.remove(a);
    }
    
    public Airliner searchAirliner(String keyWord) {
        for(Airliner a : airDir) {
            if(keyWord.equals(a.getAirlinerName())) {
                return a;
            }
        }
        return null;
    }

    
}
