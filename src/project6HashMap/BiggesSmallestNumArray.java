package project6HashMap;

public class BiggesSmallestNumArray {
    public static void main(String[] args) {

        /*
        Find the biggest and smallest number from an array ( do not use List) plain for loop
         */


        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int biggest = 0;
        int smallest = num[0];

        for (int i = 0; i < num.length; i++) {

            if (num[i] > biggest) {

                biggest = num[i];
            }else if(num[i] < smallest){
                smallest = num[i];
            }
        }
        System.out.println(biggest);
        System.out.println(smallest);


        int[] array = {100,200,450,300,250};

        int largest = array[0];
        int secondLargest = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > largest){
                secondLargest = largest;
                largest = array[i];
            }else if(array[i] > secondLargest && array[i] != largest){
                secondLargest = array[i];
            }
        }
        System.out.println("The largest number is "+largest+" and the second largest number is "+secondLargest);

    }
}
