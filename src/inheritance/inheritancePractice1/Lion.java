package inheritance.inheritancePractice1;

public class Lion extends WildAnimal {

    String name = "Simba";

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                '}';
    }
}
