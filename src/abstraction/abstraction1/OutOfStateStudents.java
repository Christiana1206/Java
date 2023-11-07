package abstraction.abstraction1;

public abstract class OutOfStateStudents extends OnlineStudents {  //extending from concrete class

    public OutOfStateStudents(String name, int age) {
        super(name, age);//we cannot create an object of abstract classes
    }

    public  abstract void callOffice();

    public static void jogging(){
        System.out.println("outOfState students are jogging");
    }

    private void dance(){
        System.out.println("dancing");
    }

    final public void stop(){
        System.out.println("stopping");

    }

    }




