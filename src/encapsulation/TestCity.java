package encapsulation;

public class TestCity {
    public static void main(String[] args) {
        /*
        create a "TestCity" class
    *give the value for each field and show them to user
    */


        City city = new City();
        city.setName("Chicago");
        System.out.println(city.getName());

        city.setPopulation(6549020);
        System.out.println(city.getPopulation());

        city.setState("IL");
        System.out.println(city.getState());

        city.setEstablishmentYear(1874);
        System.out.println(city.getEstablishmentYear());

        //find out how old this city is

        Integer currentYear = 2023, ageOfCity, establishmentYear = city.getEstablishmentYear();
        ageOfCity = currentYear - establishmentYear;
        System.out.println(ageOfCity);



    }
}
