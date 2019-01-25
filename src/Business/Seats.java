/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ami Gandhi
 */
public class Seats {
    
    private Map<Integer, String> seatMap ;
    
    public Seats()
    {
    
    seatMap = new HashMap<>();
    
    }
    
    // function to populate hashmap
    public void populateHashMap(Integer i, String value)
         {
                seatMap.put(i, value);
          }

    // getter and setter
    public Map<Integer, String> getSeatMap() {
        return seatMap;
    }

    public void setSeatMap(Map<Integer, String> seatMap) {
        this.seatMap = seatMap;
    }


    
}
