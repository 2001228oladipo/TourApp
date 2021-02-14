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
 * Class TourAgent represent a tour agent of the system, the constructor 
 * takes two variables the agent's name and the agent's location
 * This class also implements Comparable.
 */
public class TourAgent implements Comparable<TourAgent> {   
    /** 
     * 
     * @param name
     * @param location 
     */
    public TourAgent(String name, String location){
        this.name = name;
        this.location = location;
    }
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    
    @Override
    public String toString() {
        return "Agent " + name + "is based in " + location;
    }
    
    @Override
    public int compareTo(TourAgent other) {
        return this.name.compareTo(other.getName());
    }
    
    private String name; // Agent name
    private String location; // Agent location
}
