package objectPractice;

public class Cat {

    String name;
    String color;
    char gender;
    int foodAmount;

    /*
    create a 'run' method
    it will take a parameter for destination
    it will print out > " ..Tom is running to destination .."
    create another class to call run method, so that you can test it
     */
    /*
    modify the run method below:
    if the cat has some amount of food he will be eating it and print this message when eating
    " ..Tom is running to destination .."
    every time the cat eats it will reduce the food amount by 1
     */

    public void run(String destination){
        System.out.println(name+" is running to "+destination); //finish creating the method


        if(foodAmount >0 ){
            System.out.println(name+" is eating and remaining food is "+ --foodAmount);
        }else{
            System.out.println("There is no food left to feed the cat");
        }
    }
    // create a method that will take a parameter and inside of method it will set the parameter as the color of cat's value

    public void setColor(String color1){
        color = color1;
    }
    public void setFoodAmount(int amount) {
        foodAmount = amount;
    }

    public void setGender(char gender1){

        gender = gender1;
    }

    // create a method to return a value of the instance variable

    public String getName() {

        return name;
    }
    public String getColor() {
        return color;

    }
    public char getGender() {

        return gender;
    }

    public int getFoodAmount() {

        return foodAmount;
    }



}
