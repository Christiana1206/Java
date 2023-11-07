package objectPractice;

public class Netflix {
    /*
    Your family shares the same internet plan and you only have 200GB data
After each person’s usage of Netflix the data decreases by 2
I want to see the leftover data after every usage
     */

   static int data = 200;



    public static int shareNet(){

        data = data - 2;

        System.out.println("Streaming... The left over data is: "+data);

        return data;

    }

    public static void main(String[] args) {

        Netflix.shareNet();

        Netflix n1 = new Netflix();
        n1.shareNet(); // i have to call it manually

        Netflix n2 = new Netflix();
        n2.shareNet();



        /*Netflix member1 = new Netflix("mother");
        Netflix member2 = new Netflix("brother");


        System.out.println(member1.name);
        System.out.println(member2.name);
        member1.shareNet();
        member2.shareNet();

        Netflix.shareNet();

         */

    }


}