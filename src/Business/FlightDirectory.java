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
public class FlightDirectory {
    
    private ArrayList<Flight> flightDir;
    
    public FlightDirectory()
    {
        flightDir = new ArrayList<Flight>();
    }
    
    //getter

    public ArrayList<Flight> getFlightDir() {
        return flightDir;
    }
    
    //functions
    public Flight addFlight() {
        Flight f = new Flight();
        flightDir.add(f);
        return f;
    }
    
    public void removeFlight(Flight f) {
        flightDir.remove(f);
    }
    
    public Flight searchFlight(int id) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(Flight f : flightDir) {
            if(f.getFlightNumber() == id) {
                return f;
            }
        }
        return null;
    }
    
}
