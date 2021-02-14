package rgu;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABIMBOLA JOHN OLADIPO
 * Create on : 11/23/2020
 * Class Booking implements interface Comparable from package @see java.lang
 * The Booking class is used to hold booking done in the system.
 * It requires instances from the Tourist class, TourPackage class and the Date class from package java.util
 * it hold overridden copies of function equals, used to compare to instances of the same class, 
 * toString, to give a user friendly view of the class and  
 * hashCode: inherited from class Object, used to give a unique hashCode for each instance of the class
 */
public class Booking{
    private Tourist tourist;
    private TourPackage tourPackage;
    private Date datetime;
    private final SimpleDateFormat dateformater;

    /**
    * 
     * @param tourist
     * @param tourPackage
     * @param datetime
     * Booking constructor accepts instances of class Tourist, TourPackage and LocalDate
    */
    public Booking(Tourist tourist, TourPackage tourPackage, Date datetime) {
        this.tourist = tourist;
        this.tourPackage = tourPackage;
        this.datetime = datetime;
        dateformater = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    public Tourist getTourist() {
        return tourist;
    }

    public void setTourist(Tourist tourist) {
        this.tourist = tourist;
    }

    @Override
    public String toString() {
        super.toString();
        String concat = "Tourist: ".concat(getTourist().getName());
        String concat1 = " Booked: ".concat(getTourPackage().getDescription());
        String concat2 = " Booking Date: ".concat(getDatetimeAsString());
        return concat + concat1 + concat2;
    }
    
    public String getDatetimeAsString(){
        return dateformater.format(getDatetime());
    }
    
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass() || !(object instanceof Booking) ) {
            return false;
        }
        final Booking otherBooking = (Booking) object;
        if (!Objects.equals(this.tourist, otherBooking.tourist) || !Objects.equals(this.tourPackage, otherBooking.tourPackage)) {
            return false;
        }
        return Objects.equals(this.datetime, otherBooking.datetime);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (tourist != null) {
            hash = 31 * hash + tourist.hashCode();
        }
        if (tourPackage != null) {
            hash = 31 * hash + tourPackage.hashCode();
        }
        if (datetime != null) {
            hash = 31 * hash + datetime.hashCode();
        }
        if (dateformater != null) {
            hash = 31 * hash + dateformater.hashCode();
        }
        return hash;
    }
}
