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
public class Airliner {
    
    private String airlinerName;
    private String airlinerType;
    private FlightDirectory flightDir;

    
    public Airliner() {
        flightDir = new FlightDirectory();
    }

// getter and setter

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getAirlinerType() {
        return airlinerType;
    }

    public void setAirlinerType(String airlinerType) {
        this.airlinerType = airlinerType;
    }
    
    public FlightDirectory getFlightDir() {
        return flightDir;
    }
    
    @Override
    public String toString() {
        return airlinerName;
    }
    
}
