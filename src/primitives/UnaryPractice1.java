package primitives;

public class UnaryPractice1 {
    public static void main(String[] args) {

        int flower = 17;
        System.out.println(flower); // 17

        ++flower;
        System.out.println(flower); // 18
        System.out.println(++flower); // 19

        --flower;
        System.out.println(flower); // 18
        System.out.println(--flower); // 17

        System.out.println(flower); // 17

        flower++;
        System.out.println(flower); // 18

        System.out.println(flower++); // 18
        System.out.println(flower); // 19

        flower--;
        System.out.println(flower); // 18

        System.out.println(flower--); // 18 but flower is 17 behind the scene

        // System.out.println(============);
        System.out.println(flower-- -7); // 17-7 = 10
        System.out.println(flower); // 16

        flower = --flower +4+1;
        System.out.println(flower); // 20

        flower = 9+flower++;
        System.out.println(flower); // 29
        System.out.println(flower); // 29
        flower =  9 + ++flower;
        System.out.println(flower); // 39

        int vase = 9 + flower++;
        System.out.println(flower); // 40

        System.out.println(vase); // 48 -- has been stored before incrementing , so inside vase is now 48

        int burger = 10;

        int drink = burger++ + ++burger; //
        System.out.println("drink is now " +drink); // 22

        int drink1 = ++burger +burger++;
        System.out.println(drink1);

        int a = 5, b=++a+5, k = ++b+a++; // a = 5, b =11, k = (12+6) = 18

        --k; // 17
        a = --k; // 15
        System.out.println(--a);


    }
}
