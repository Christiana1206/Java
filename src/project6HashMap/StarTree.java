package project6HashMap;

public class StarTree {
    public static void main(String[] args) {

        int number = 5;

        String star = "*";

        do {
            System.out.println(star); //*
            star += "*";       // OR: star = star.concat("*");
            number--;
        } while (number > 0);


        System.out.println("=======================");

// theirs version , not completed

        int num = 5;
        for(int i = 0; i <= num; i++){
            for(int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();




        }


        }
    }







