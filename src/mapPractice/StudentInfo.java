package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class StudentInfo {
    public static void main(String[] args) {

    /*
    StudentInfo
--------------
FirstName: David
LastName: Pena
Age: 25
Gender: M
City: Chicago
FirstName: Jeremiah
LastName: Michaelson
Age: 15
Gender: M
City: HighPark
FirstName: Michael
LastName: White
Age: 35
Gender: M
City: Winnetka
FirstName: Sarah
LastName: Star
Age: 29
Gender: F
City: Chicago
/*
Create a map for each student
Create a list to store all student maps
If gender of student is ‘Female’,
	generate an email for her by using her lastName >>>“lastname@gmail.com”
*
     */

        LinkedHashMap<String, String> student1 = new LinkedHashMap<>();
        student1.put("FirstName", "David");
        student1.put("LastName", "Pena");
        student1.put("Age", "25");
        student1.put("Gender", "M");
        student1.put("City", "Chicago");

        LinkedHashMap<String, String> student2 = new LinkedHashMap<>();
        student2.put("FirstName", "Jeremiah");
        student2.put("LastName", "Michaelson");
        student2.put("Age", "15");
        student2.put("Gender", "M");
        student2.put("City", "HighPark");

        LinkedHashMap<String, String> student3 = new LinkedHashMap<>();
        student3.put("FirstName", "Michael");
        student3.put("LastName", "White");
        student3.put("Age", "35");
        student3.put("Gender", "M");
        student3.put("City", "Winnetka");

        LinkedHashMap<String, String> student4 = new LinkedHashMap<>();
        student4.put("FirstName", "Sarah");
        student4.put("LastName", "Star");
        student4.put("Age", "29");
        student4.put("Gender", "F");
        student4.put("City", "Chicago");

        List<LinkedHashMap<String,String>> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);


        System.out.println(list);

        for(LinkedHashMap<String, String> studentMap: list){
            if(studentMap.get("Gender").equals("F")){
                System.out.println(studentMap.get("LastName").concat("@gmail.com"));
            }
        }

    }
    /*
    create a method which will take a list of map
    this methods will check if the age of students is less than 30
    it will store and return city of those students in a list
     */
    public static List<String> cityOfStudent(List<LinkedHashMap<String,String>> listOfMap){
        List<String> cities = new ArrayList<>();
        for (LinkedHashMap<String,String> studentMap: listOfMap){
            Integer age = Integer.parseInt(studentMap.get("Age"));
            if(age < 30){
                cities.add(studentMap.get("City"));
            }

        }
        return cities;
    }
}





