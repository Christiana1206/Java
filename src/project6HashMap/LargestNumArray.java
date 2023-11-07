package project6HashMap;

public class LargestNumArray {
    public static void main(String[] args) {
        // 1. Find the largest number and secondLargest number from an array

        int[] arrays = {1,2,3,4,5,6,7,8,-9, 99};

        int largest = arrays[0];
        int secondLargest = 0;

        for(int i = 0; i < arrays.length; i++){

            if(arrays[i] > largest){
                secondLargest = largest; // even largest is 0, at the second line it will renew secondLargest every time
                largest = arrays[i];
            } else if(arrays[i] > secondLargest && arrays[i] != largest){    // (arrays[i] < largest)
                secondLargest = arrays[i];

            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);


    }
}
