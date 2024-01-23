
package model;
public class Country extends EastAsiaCountries implements Comparable<Country> {
    private String countryTerrain;

    public Country() {
    }

    public Country(String countryTerrain, String countryCode, String countryName, float totalArea) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }
    
    @Override
    public void display(){
        System.out.printf("%-15s%-15s%-15s%-15s%n", "ID", "Name", "Total Area", "Terrain");
        System.out.printf("%-15s%-15s%-15.1f%-15s%n", this.getCountryCode(), this.getCountryName(), this.getTotalArea(), this.getCountryTerrain());
    }

    @Override
    public int compareTo(Country o) {
        return this.getCountryName().compareTo(o.getCountryName());
    }

    
}
