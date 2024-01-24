
package model;

public class EastAsiaCountries extends Country implements Comparable<EastAsiaCountries>{
    private String countryTerrain;

    public EastAsiaCountries() {
    }

    public EastAsiaCountries(String countryCode, String countryName, float totalArea) {
        super(countryCode, countryName, totalArea);
    }

    public EastAsiaCountries(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountries(String countryTerrain, String countryCode, String countryName, float totalArea) {
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
    public void display() {
        System.out.println(String.format("%-10s%-25s%-20.0f%-25s", this.countryCode, this.countryName, this.totalArea, this.countryTerrain));
    }

    @Override
    public int compareTo(EastAsiaCountries o) {
        return this.countryName.compareTo(o.countryName);
    }
    
}
