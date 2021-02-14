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
 * This class represent a tourist in the system
 */
public class Tourist {
    /**
     * @param name
     * @param country
     * @param audioLanguage
     */
    public Tourist(String name, String country, AudioLanguage audioLanguage) {
        validateNameData(name);
        validateCountryData(country);
        if(audioLanguage != null)
            this.audioLanguage = audioLanguage;
    }

    /**
     *
     * @param name
     */
    public final void validateNameData(String name){
        if(!name.isEmpty())
            setName(name);
    }
    
    public final void validateCountryData(String country){
        if(!country.isEmpty())
            setCountry(country);
    }
    
    private void setCountry(String country) {
        this.country = country; // validate data entered
    }
    
    private void setName(String name) {
            this.name = name; // validate data entered
    }
    
    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public AudioLanguage getAudioLanguage() {
        return audioLanguage;
    }

    /**
     *
     * @param audioLanguage
     */
    public void setAudioLanguage(AudioLanguage audioLanguage) {
        if(audioLanguage != null)
            this.audioLanguage = audioLanguage;
    }

    @Override
    public String toString() {
        super.toString(); 
        return "Tourist: " +getName() + " From:" + getCountry() + " Speakes: " + getAudioLanguage();
    }
    
    private String name;
    private String country;
    private AudioLanguage audioLanguage;
}
