package mapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Practice3 {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("toyota", "corolla");
        hashMap.put("lexus", "ES350");
        hashMap.put("bmw", "X7");
        hashMap.put("honda", "accord");

        //all values()
        System.out.println(hashMap); // {toyota=corolla, honda=accord, lexus=ES350, bmw=X7}

        Collection<String> values = hashMap.values();

        System.out.println(values); //[corolla, accord, ES350, X7]

        Set<String> keys = hashMap.keySet();

        for(String carMake : keys){
            if(carMake == "toyota"){
                System.out.println("take it to the insurance office");
            }
        }

        //Task: if the car is corolla, tell user to take it to the dealer


        for(String carName : values){
            if (carName == "corolla") {
                System.out.println("Take it to the dealer");
            }

        }

    }
}
