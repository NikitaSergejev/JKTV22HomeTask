/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class NumberParcer {

    private final Scanner scanner;

    public NumberParcer(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doParse() {
        System.out.println("Введите трёх значное число: ");
        int number = scanner.nextInt();
        int edCount= number%10;        
        int decCount= number/10;
        int sumDigits=(number%10)+((number/10)%10)+((number/100)%10);        
        System.out.println("В этом числе: ");
        System.out.println(" -единиц: " + edCount);
        System.out.println(" -десятков: " + decCount);
        System.out.println(" -сумма цифр: " + sumDigits);
        
    }
    
}
