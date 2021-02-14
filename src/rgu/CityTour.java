package rgu;

/**
 *
 * @author ABIMBOLA JOHN OLADIPO
 * Create on : 11/23/2020
 * Class CityTour extends TourPackage and implement method getCost
 * This class represents a base class of a super class TourPackage
 * adapted for city tours with and option to choose a guide.
 */
public class CityTour extends TourPackage{
    /**
     *
     * @param withGuide
     * @param guideCost
     * @param description
     * @param location
     * @param tourCost
     */

    public CityTour(boolean withGuide, double guideCost, String description, String location, double tourCost) {
        super(description, location, tourCost);
        setWithGuide(withGuide);
        updateGuideCost(guideCost);
    }

    public final void updateGuideCost(double guideCost){
        if(guideCost > this.guideCost)
            this.guideCost = guideCost;
    }

    public double getGuideCost() {
        return guideCost;
    }

    public boolean isWithGuide() {
        return withGuide;
    }

    public final void setWithGuide(boolean withGuide) {
        this.withGuide = withGuide;
    }
    
    @Override
    public String toString() {
        StringBuilder toString = new StringBuilder();
        toString.append("Tour Type: City Tour");
        toString.append("\n ");
        toString.append("Tour Guide:").append(isWithGuide());
        toString.append("\n ");
        toString.append("Guide Cost:").append(getGuideCost());
        toString.append("\n ");
        toString.append(super.toString());
        
        return toString.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double getCost() {
        return isWithGuide() ? getGuideCost() + getTourCost() : getTourCost();
    }
    
    private double guideCost;
    private boolean withGuide;
}
