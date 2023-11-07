package wrapperPractice;

public class TestMicrophone {
    public static void main(String[] args) {

        Microphone m1 = new Microphone("Nokia", "black", "100");
        Microphone m2 = new Microphone("Samsung", "silver", "55.75");
        Microphone m3 = new Microphone("Amazon", "gold", "25.99");
        Microphone m4 = new Microphone("LG", "red", "75.50");


        Microphone[] products = {m1, m2, m3, m4};

        Microphone.priceChecker(products);





    }
}
