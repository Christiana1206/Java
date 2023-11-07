package encapsulation;

public class City {

    /*
    create a "City" class
    - population, establishYear, name, state
    *use encapsulation process to modify the 'City' class

    create a "TestCity" class
    *give the value for each field and show them to user
    */

    private int population, establishmentYear;

    private String  name,state;



    public void setPopulation(int population){

        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public int getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
