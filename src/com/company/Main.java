package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите положительное число больше 3");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        Random random = new Random();

        int[] array = new int [n];

        for (int i=0; i<array.length; i++) {
            array[i] = random.nextInt(n);
        }

        System.out.println(Arrays.toString(array));

        int product=1;
        for (int i=0; i<array.length; i++) {
            if (array[i] % 3==0 && array[i]!=0){
                product*=array[i];
            }
        }
        System.out.println("Произведение элементов массива кратных 3 равно "+product);
    }
}
