/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ami Gandhi
 */
public class Flight {
    
    private static int count = 0;
    private int flightNumber;
    private String flightName;
    private String flightSource;
    private String flightDestination;
    private float flightPrice;
    
    private Seats seats;
    
    //private int SeatNumber;
    //private int NoOfSeats = 5;
    
    public Flight() {
        count++;
        flightNumber = count;
        seats = new Seats();
    }

    public Seats getSeats() {
        return seats;
    }

    public void setSeats(Seats seats) {
        this.seats = seats;
    }

    
    public int getFlightNumber() {
        return flightNumber;
    }
    
    
    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightSource() {
        return flightSource;
    }

    public void setFlightSource(String flightSource) {
        this.flightSource = flightSource;
    }

    public String getFlightDestination() {
        return flightDestination;
    }

    public void setFlightDestination(String flightDestination) {
        this.flightDestination = flightDestination;
    }

    public float getFlightPrice() {
        return flightPrice;
    }

    public void setFlightPrice(float flightPrice) {
        this.flightPrice = flightPrice;
    }

    
    /*public int getNoOfSeats() {
        return NoOfSeats;
    }

    public void setNoOfSeats(int NoOfSeats) {
        this.NoOfSeats = NoOfSeats;
    }

    public int getSeatNumber() {
        return SeatNumber;
    }

    public void setSeatNumber(int SeatNumber) {
        this.SeatNumber = SeatNumber;
    }*/

    
    @Override
    public String toString() {
        return flightName;
    }
    
}
