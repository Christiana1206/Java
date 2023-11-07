package objectPractice;

public class TestComputer {
    public static void main(String[] args) {

        Computer computer1 = new Computer(); //!! Computer is class name, and I take it to make this Constructor, and give an object name - computer1
            //these parentheses are from --> public Computer() from Computer class and check are there some argument or no
        //Constructor is a special way to create an object
        //before I was using default constructor
        //if there is no parameter for my constructor I created, I don't need to pass any parameters

        computer1.playGame();
        computer1.playGame(3);

        System.out.println("------------------");

        Computer computer2 = new Computer("apple");
        System.out.println("c2 brand >>"+computer2.brand);
        System.out.println("c2 brand >>"+computer2.color);





    }
}
