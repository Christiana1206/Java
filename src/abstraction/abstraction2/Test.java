package abstraction.abstraction2;

public class Test {
    public static void main(String[] args) {


        //you cannot create an object from interfaces, we should create subclasses
        //CanFly fly = new CanFly();
        //CanSwim swim = new CanSwim();

        Bird bird = new Bird();
        bird.fly();
        bird.landing();

        //instance variables of interface are Static by default

        System.out.println(bird.WINGS); //it's like static

        //instance variables in interface are final by default
        //bird.WINGS = 4; --can't change a value

        Fish fish = new Fish();
        System.out.println(fish.GILLS);
        fish.dive();
        fish.swim();

        Duck duck = new Duck();
        duck.dive();
        duck.fly();
        duck.landing();
        duck.swim();
        duck.eat(); //comes from Animal class

        System.out.println(fish.eye);//2
        fish.eye = 4;
        System.out.println(fish.eye);//4 because variable is from normal class

        Puffin puffin = new Puffin();
        puffin.dive();
        puffin.fly();
        puffin.landing();
        puffin.run();
        puffin.swim();
        puffin.eat();
        puffin.speeding();







    }
}
