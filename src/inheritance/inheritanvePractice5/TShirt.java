package inheritance.inheritanvePractice5;

public class TShirt extends Shirt{

    public TShirt(){

        super(50);
    }
//         @Override
//        final public void washed(){
//       System.out.println("Washable Shirt"); }
//    washed()' cannot override 'washed()' in 'inheritance.inheritancePractice5.Shirt';
//    overridden method is final

    public void info(){
        System.out.println("I am in TShirt class");
    }




    }




