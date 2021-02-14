/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgu;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ABIMBOLA JOHN OLADIPO
 * Create on : 11/23/2020
 * This is a class containing the main method used to run the application.
 * it contains instances from other classes in the application, utilizing them as needed
 */
public class TourApp {
    private ArrayList<TourPackage> tours = new ArrayList();
    private ArrayList<Booking> bookinglist = new ArrayList();
    private final BookingUtils utils;
    
    public TourApp() {
        utils = new BookingUtils();
        tours = new ArrayList();
        bookinglist = new ArrayList();
    }
    
    public void addTours(TourPackage tour){
        tours.add(tour);
        if(tour instanceof CityTour){
            System.out.print("A City Tour package added to TourApp: ");
            System.out.printf("A tour of %s with a total cost of %.2f ", tour.getLocation(), tour.getCost());
            System.out.println(((CityTour) tour).isWithGuide() ? "including a personal guide." : "");
        }else if(tour instanceof SightseeingTour){
            System.out.print("A Sightseeing Tour package added to TourApp: ");
            System.out.printf("A Sightseeing tour in %s with a total cost of %.2f including ticket%n", tour.getLocation(), tour.getCost());
        }
    }
    
    public void addBookingsInstace(Booking booking){
        bookinglist.add(booking);
    }

    public ArrayList<Booking> getBookinglist() {
        return bookinglist;
    }

    public ArrayList<TourPackage> getTours() {
        return tours;
    }
    
    public void calculateBill(Tourist tourist){
        double[] cost = utils.calculateBill(getBookinglist(), tourist);
        System.out.println("Total bill for "
                + tourist.getName() + ":" +
                cost[0]
                + "£");
        System.out.println("Discounted bill for "
                + tourist.getName() + ":" +
                cost[1]
                + "£");
    }
    
    public static void main(String[] args) {
        TourApp tourApp = new TourApp();
        
        SightseeingTour sightseeingTour = new SightseeingTour(200, "A sight Seeing Tour of Accra", "Ghana", 1000);
        CityTour citytour = new CityTour(true, 100, "A Tour of London city!", "London", 500);
        
        tourApp.addTours(citytour);
        tourApp.addTours(sightseeingTour);
        
        System.out.println(tourApp.getTours().size()+ " tour packages available in tour app");
        
        Tourist parker = new Tourist("Jan Parker", "South Africa", AudioLanguage.English);
        System.out.println("Tourist " + parker.getName() + " added to the TourApp!"); 
        
        Booking booking1 = new Booking(parker, sightseeingTour, new Date());
        tourApp.addBookingsInstace(booking1);
        System.out.println(parker.getName()
                    +" booked " + booking1.getTourPackage().getDescription()
                    +" with a total cost of " + " on "+ booking1.getDatetimeAsString());
        
        CityTour customTour = new CityTour(false, 0, "A Tour of New York city!", "New York", 1000);
        
        Booking booking2 = new Booking(parker, customTour, new Date());
        System.out.printf("A custom tour package created for %s without a guide%n", parker.getName());
        tourApp.addBookingsInstace(booking2);
         System.out.println(parker.getName()
                    +" booked " + booking2.getTourPackage().getDescription()
                    +" with a total cost of " + " on "+ booking2.getDatetimeAsString());
        tourApp.calculateBill(parker);
        booking2.getTourPackage().updateTourCost(2000);
        
        System.out.println(booking2.getTourPackage().getDescription()+ " updated:");
        
        tourApp.calculateBill(parker);
    }
}
