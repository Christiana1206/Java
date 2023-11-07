package setPractice;

import java.util.HashSet;

public class TestFlower {
    public void findRedFlower(HashSet<Flower> bouquet){
        for(Flower flower : bouquet){
            if(flower.color.equalsIgnoreCase("red")){
                System.out.println(flower.type+" is the flower that has "+flower.color+" color");
            }
        }
    }

    public static void main(String[] args) {

        TestFlower t1 = new TestFlower();
        HashSet<Flower> vase = new HashSet<>();
        Flower f1 = new Flower("Rose", "Red", "abcd", 5.99);
        Flower f2 = new Flower("SunFlower", "Yellow", "medium", 3.99);
        Flower f3 = new Flower("Lily", "White", "Large", 7.99);
        Flower f4 = new Flower("Rose", "pink", "small", 0.99);


        vase.add(f1);
        vase.add(f2);
        vase.add(f3);
        vase.add(f4);

        t1.findRedFlower(vase);
    }
}
