/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgu;

/**
 *
 * @author ABIMBOLA JOHN OLADIPO
 * Created on : 11/23/2020
 * This is an abstract class that has a single abstract method required to be implemented
 * the class is a base for creating tour packages and defines several methods for this purpose.
 */
 public abstract class TourPackage {
    /**
     *
     * @param description
     * @param location
     * @param tourCost
     */
    public TourPackage(String description, String location, double tourCost){
        setDescription(description);
        setLocation(location);
        updateTourCost(tourCost);
    }

    public String getDescription() {
        return description;
    }

    public final void setDescription(String description){
            this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public final void setLocation(String location){
            this.location = location;
    }

    public double getTourCost() {
        return tourCost;
    }

    public final void updateTourCost(double tourCost){
        if(tourCost > this.tourCost)
            this.tourCost = tourCost;
    }

    @Override
    public String toString() {
        StringBuilder friendlyOutput = new StringBuilder();
        friendlyOutput.append("Tour Description: ").append(getDescription());
        friendlyOutput.append(" ");
        friendlyOutput.append("Tour Cost: ").append(getCost());
        friendlyOutput.append(" ");
        friendlyOutput.append("At Location: ").append(getLocation());
        friendlyOutput.append(" ");
              
        return friendlyOutput.toString(); 
    }

    
    abstract public double getCost();
    
    private String description;
    private String location;
    private double tourCost;
}
