package projectDayElmar;

import java.util.Arrays;
import java.util.List;

public class BubleSorting {
    public static void main(String[] args) {

/*
        int[] arr = {4, 1, 3, 5, 2};
        int[] expectedArr = {1, 2, 3, 4, 5};


        for (int i = 0; i < arr.length -1; i++){
            for(int j = 0; j < arr.length -1 - i; i++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(expectedArr));

 */

       // int[] arr = {4, 1, 3, 5, 2};
        List<Integer> arr = Arrays.asList(4, 1, 3, 5, 2);

        //int[] expectedArr = {1, 2, 3, 4, 5};
        List<Integer> expectedArr = Arrays.asList(1, 2, 3, 4, 5);


        for (int i = 0; i < arr.size() -1; i++){
            for(int j = 0; j < arr.size() -1 - i; i++){
                if(arr.get(j) > arr.get(j + 1)){
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        System.out.println(arr);
        System.out.println(expectedArr);

    }
}
