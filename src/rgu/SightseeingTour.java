/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgu;


/**
 *
 * @author ABIMBOLA JOHN OLADIPO
 * Create on : 11/23/2020
 * Class SightseeingTour extends TourPackage and implement method getCost
 * This class represents a base class of a super class TourPackage
 * adapted for sightseeing tours.
 */
public class SightseeingTour extends TourPackage{
    /**
     * @param ticketCost
     * @param description
     * @param location
     * @param tourCost
     */
    public SightseeingTour(double ticketCost, String description, String location, double tourCost){
        super(description, location, tourCost);
        updateTicketCost(ticketCost);
    }

    public final void updateTicketCost(double ticketCost){
        if(ticketCost > this.ticketCost)
            this.ticketCost = ticketCost;
    }

    public double getTicketCost() {
        return ticketCost;
    }

    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        toString.append("Tour Type: Sightseeing");
        toString.append(" Ticket Cost:").append(getCost());
        toString.append(" Total Cost:").append(getCost());
        toString.append(" "+super.toString());
        return toString.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double getCost() {
        return getTicketCost() + getTourCost();
    }
    
    private double ticketCost;
}
