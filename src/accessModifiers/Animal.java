package accessModifiers;

public class Animal {
    public String name;
    protected String color;
    int age;
    private char gender;

    {
        //all access modifiers allow me to be able to reach out to any of fields as long as it's in the same class
        name = "Alex";
        color = "blue";
        age = 11;
        gender = 'm';

        if (age>5){
            System.out.println(gender+" "+name+" "+color);
        }
        runDefault();
        runProtected();
        runPublic();
        runPrivate();


    }
    public void runPublic(){

        System.out.println("running public");
    }
    protected void runProtected(){
        System.out.println("running protected");
    }

    void runDefault(){

    }
    private void runPrivate(){
        System.out.println("running private");
    }



}
