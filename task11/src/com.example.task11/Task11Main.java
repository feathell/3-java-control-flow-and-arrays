package com.example.task11;

import java.util.Arrays;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        if ((arr == null) || (arr.length == 0)) { return; }
        int min = Arrays.stream(arr).min().getAsInt();
        int ind_min = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == min) {
                ind_min = i;
                break;
            }
        }
        arr[ind_min] = arr[0];
        arr[0] = min;
    }

}