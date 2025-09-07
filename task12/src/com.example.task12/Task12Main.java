package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if (arr == null) {return;}

        int min, ind;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            ind = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < min) {
                    min = arr[j];
                    ind = j;
                }
            }
            arr[ind] = arr[i];
            arr[i] = min;
        }
    }

}