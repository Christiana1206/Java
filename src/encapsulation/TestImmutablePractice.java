package encapsulation;

public class TestImmutablePractice {

    public static void main(String[] args) {

        ImmutablePractice immutable = new ImmutablePractice();

        String brand = immutable.getBrand();
        System.out.println(brand);

        double price = immutable.getPrice();
        System.out.println(price);

      //  String brand = immutable.getBrand();
    }
}
