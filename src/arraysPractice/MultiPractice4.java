package arraysPractice;

public class MultiPractice4 {
    public static <Srting> void main(String[] args) {

        /*
        We go to electronic store, there are selling tv, computers and speakers.
-We are storing the brand names of tv, computers & speakers in one array;
-Each of the item has its own price: tv price, computer price, speaker price in one array;
I want to pull name&price, name&price and match them say: Apple tv is $1000.
		TV 							Computers			Speakers
 Samsung, LG, Sony				Apple, HP, Dell		Google,  JBL,  Amazon
985.99,   500, 755				2100,  900, 700		 99.99, 250.45, 120.50
“Samsung is $985.99”
         */

        String[][] items = {{"Samsung", "LG", "Sony" }, {"Apple", "HP", "Dell" }, {"Google", "JBL", "Amazon" }};

        double[][] prices = {{985.99, 500, 755}, {2100, 900, 700}, {99.99, 250.45, 120.50}};

        // for(String[] section : items){ --> FOR EACH LOOP is too complicated in this case!!


        for (int a = 0; a < items.length; a++) {
            for (int b = 0; b < items[a].length; b++) {    //  for(int b = 0; b < prices.length; b++) also works!!! Because both size of arrays are equal
                //System.out.println(items[a][b] + " is $" + prices[a][b]);


                // print the price of Samsung

                /*
                if(items[a][b].equalsIgnoreCase("Samsung"){
                   // System.out.println("As your request "+ items[a][b]+" is $ "+prices[a][b]);
                   // break; // --> stop iteration, exit the loop
                 */

                // tell me the price of an item only if it is less than $200

                if(items[a][b].equalsIgnoreCase("google") && prices[a][b] < 200){
                   // System.out.println("As your request "+ items[a][b]+" is $ "+prices[a][b]);
                   // break; // --> stop iteration, exit the loop

                  //  if(prices[a][b] > 200){
                        System.out.println("As your request "+items[a][b]+" is $ "+prices[a][b]);
                        break;

                    }
                }


            }

        }




    }












