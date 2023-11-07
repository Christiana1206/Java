package inheritance.inheritanvePractice5;

public class Test {
    public static void main(String[] args) {

        Shirt shirt = new Shirt(100);
      //  shirt.COLOR = "Red"; cannot do this

        System.out.println(shirt.COLOR); //Blue
        System.out.println(shirt.COLOR.toLowerCase()); //blue

        shirt.washed(); //Washable Shirt

        TShirt tShirt = new TShirt();
        System.out.println(tShirt.COLOR); //Blue
        // tShirt.COLOR = "Black"; --> cannot change final instance variable

        tShirt.washed();


        Shirt s = new TShirt();
        //Map map = new HashMap --> I'm creating HashMap object, but my methods come from Map (left and right side)
        //List list = new ArrayList --> I'm creating ArrayList, but my methods come from List
        // Set set = new HashSet

       // s.info() -> this method doesn't exist for this because I can only see the parent class features
        //left side is deciding where to call the method from
        //right side is deciding what kind of object we are creating









    }
}


