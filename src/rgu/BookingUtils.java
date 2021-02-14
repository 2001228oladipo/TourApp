/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author ABIMBOLA JOHN OLADIPO
 * Create on : 11/23/2020
 * Class BookingUtils is a utility class to help calculate booking discount
 * it has a single method calculateBill which take an ArrayList of Booking Objects and a Tourist object containing the tourist 
 * we wish to calculate the discount for.
 * The method calculateBill implements an inner class version or Comparable 
 * customize to compare the booking dates in when class Collections sort method is called
 * the calculateBill method return a double array containing the accumulated cost of all tour packages
 * the tourist has booked and their associated discounts if applicable.
 * 
 */
public class BookingUtils {
    
    public double[] calculateBill(ArrayList<Booking> list, Tourist tourist){
        double[] price = new double[2];
        Collections.sort(list, (Booking booking1, Booking booking2) -> {
            Date date1 = booking1.getDatetime();
            Date date2 = booking2.getDatetime();
            if (date1.compareTo(date2) == 0) {
                return 0;
            }else if (date1.compareTo(date2) < 0) {
                return 1;
            }else{
                return -1;
            }
        });
       
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getTourist().equals(tourist) && i == 0)
            {
                price[0] += list.get(i).getTourPackage().getCost();
                price[1] += list.get(i).getTourPackage().getCost();
            }
            if(list.get(i).getTourist().equals(tourist) && i == 1)
            {
                price[0] += list.get(i).getTourPackage().getCost();
                price[1] += list.get(i).getTourPackage().getCost() - (10 * list.get(i).getTourPackage().getCost()/100);
            }
            if(list.get(i).getTourist().equals(tourist) && i == 2)
            {
                price[0] += list.get(i).getTourPackage().getCost();
                price[1] += list.get(i).getTourPackage().getCost() - (15 * list.get(i).getTourPackage().getCost()/100);
            }
            if(list.get(i).getTourist().equals(tourist) && i == 3)
            {
                price[0] += list.get(i).getTourPackage().getCost();
                price[1] += list.get(i).getTourPackage().getCost() - (20 * list.get(i).getTourPackage().getCost()/100);
            }
            if(list.get(i).getTourist().equals(tourist) && i == 4)
            {
                price[0] += list.get(i).getTourPackage().getCost();
                price[1] += list.get(i).getTourPackage().getCost() - (25 * list.get(i).getTourPackage().getCost()/100);
            }
            if(list.get(i).getTourist().equals(tourist) && i == 5)
            {
                price[0] += list.get(i).getTourPackage().getCost();
                price[1] += list.get(i).getTourPackage().getCost() - (30 * list.get(i).getTourPackage().getCost()/100);
            }
            if(list.get(i).getTourist().equals(tourist) && i == 6)
            {
                price[0] += list.get(i).getTourPackage().getCost();
                price[1] += list.get(i).getTourPackage().getCost() - (35 * list.get(i).getTourPackage().getCost()/100);
            }
            if(list.get(i).getTourist().equals(tourist) && i == 7)
            {
                price[0] += list.get(i).getTourPackage().getCost();
                price[1] += list.get(i).getTourPackage().getCost() - (40 * list.get(i).getTourPackage().getCost()/100);
            }
            if(list.get(i).getTourist().equals(tourist) && i == 8)
            {
                price[0] += list.get(i).getTourPackage().getCost();
                price[1] += list.get(i).getTourPackage().getCost() - (45 * list.get(i).getTourPackage().getCost()/100);
            }
            if(list.get(i).getTourist().equals(tourist) && i >=9)
            {
                price[0] += list.get(i).getTourPackage().getCost();
                price[1] += list.get(i).getTourPackage().getCost() - (50 * list.get(i).getTourPackage().getCost()/100);
            }
        }
        return price;
    }
}

