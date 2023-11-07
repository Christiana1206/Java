package mapPractice;

import arrayList.ArrayListToArray;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class TestEmployee {
    public static void main(String[] args) {

//!!!!!!!!!!!!!!!!!!  make overwriting
        Employee e1 = new Employee("Olha", "Weston", 40);
        Employee e2 = new Employee("Taras", "Chicago", 24);
        Employee e3 = new Employee("Tilda", "New York", 18);
        Employee e4 = new Employee("Karl", "Tampa", 50);

        HashMap<Integer, Employee> employeeMap = new HashMap<>(); // for all employee maps

        HashMap<String, Integer> map = new HashMap<>(); // for map of employee
        employeeMap.put(e1.id, e1);
        employeeMap.put(e2.id, e2);
        employeeMap.put(e3.id, e3);
        employeeMap.put(e4.id, e4);

       // System.out.println(employeeMap.get(e2.id));

        printName(employeeMap);

        System.out.println(youngEmployeeCity(employeeMap));

        // I want to see all the values of e1
        //System.out.println(employeeMap.get(e1.id)); //hashCode
    }

    public static void printName(HashMap<Integer, Employee> map) {
        for (Employee employee : map.values()) {
            System.out.println(employee.name);
        }

    }

    //find out employees who are younger than age of 25 and return their
    // city name as a list

    public static List youngEmployeeCity(HashMap<Integer, Employee> map){
        List<String> cities = new ArrayList<>();
        for(Employee employee: map.values()){
        if(employee.age < 25){
            cities.add(employee.city);
        }

        }
        return cities;
    }


}

