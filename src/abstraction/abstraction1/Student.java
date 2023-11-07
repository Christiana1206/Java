package abstraction.abstraction1;

public abstract class Student {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void study() {
        System.out.println("Studying Hard");
    }

    public abstract void attend(); //don't have a body

    public abstract int eat();




}



