package arrayList;

import java.util.ArrayList;

public class Practice5 {
    /*
    create a method that will take an arrayList of Cities
    this method will generate contact e-mail address for each city
    info@chicago.com, inf0@la.com..
    return all those e-mail addresses to test your logic
     */

    public static ArrayList<String> emailCreator(ArrayList<String> cities){
        ArrayList<String> emailList = new ArrayList<>();
        for(int i = 0; i < cities.size(); i++) {
            emailList.add("info@"+cities.get(i)+".com");
        }
            return emailList;

    }
    /*
    Task2: create a method that will send email to the city provided as a parameter
    create an ArrayList of cities and use the emailCreator method to first create emails for cities you provided
    if any of the emails created matches the one provided in parameter print out message
    (info@chicago.com) -> Email is being sent to info@chicago.com
     */

    public static void mailSender(ArrayList<String> cities, String email){ // void - just print out

       // ArrayList<String> cities = new ArrayList<>();

      //  cities.add("Chicago");
       // cities.add("Bishkek");
      //  cities.add("Kiev");
      //  cities.add("Tokio");

        for(int i = 0; i < cities.size(); i++){
            if(email.equals(emailCreator(cities).get(i))){
                System.out.println("Email is being sent to >> "+email);
                break; // good for Chicago
            }else{
                System.out.println("Check the email address again");
            }

        }


    }

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("Bishkek");
        cities.add("Kiev");
        cities.add("Tokio");

        System.out.println(emailCreator(cities)); //[info@Chicago.com, info@Bishkek.com, info@Kiev.com, info@Tokio.com]


        mailSender(cities, "info@Tokio.com");
    }



}
