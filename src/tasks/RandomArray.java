/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class RandomArray {
    private final Scanner scanner;

    public RandomArray(Scanner scanner) {
        this.scanner= scanner;
    }

    public void PrintResult() {
        System.out.println("Массив случайных чисел: ");
       // int[] myArray = new int[20];
        //int min = 0;
        //int max = 0;
        int sum = 0;
        //code this
        /*1. инициировать массив случайными числами от 0 до 99
        2. вычислить мин и мах
        3. вычеслить сумму всех ячеек, вычесть из неё мин и мах, результат 
        резделить на количество ячеек массива минус 2.
        */
        int[] numbers = new int[20];
        Random rnd = new Random();
        for (int i=0; i< numbers.length; i++)
        {
            numbers[i] = rnd.nextInt(100);//random number 0..99
            System.out.printf("%3d", numbers[i]);
        }
        System.out.println("");
        int max = numbers[1];
        for (int i = 1; i < numbers.length; i++)
        {
            if(numbers[i] > max)
            {
                max = numbers[i];
            }
        }       
        int min = numbers[1];
        for (int i = 1; i < numbers.length; i++)
        {
            if(numbers[i] < min)
            {
                min = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++)
        {
            sum +=numbers[i];
        }
        double average = (double) sum / numbers.length;
        //output
        System.out.println("min = "+min);
        System.out.println("max = "+max);
        System.out.println("Сумма = "+sum);
        System.out.println("Среднее арифмитическая = "+average);
        
    }
    
}
