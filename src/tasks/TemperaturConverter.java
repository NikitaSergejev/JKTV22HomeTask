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
public class TemperaturConverter {
    
    private final Scanner scanner;
    
    public TemperaturConverter(){
        this.scanner = new Scanner(System.in);
    }

    public TemperaturConverter(Scanner scanner) {
        this.scanner= scanner;
    }
    
    
    
    public void DoConvert(){
         boolean repeat = true;
        do {
            System.out.println("-- Конвертер температуры -- ");
            System.out.println("0. Закончить функцию конвертации");
            System.out.println("1. Цельсий -> фаренгейт");
            System.out.println("2. фаренгейт -> Цельсий");
            System.out.print("Номер задачи ");
            int task = scanner.nextInt();
            switch (task) { /*sw-> tab*/
                case 0:
                    System.out.println("Выбран выход из конвертера температуры");
                    repeat = false;
                    break;
                case 1:
                    convertCelsiusFahrengeit();
                    break;
                case 2:
                    convertFahrengeitCelsius();
                    break;
                default:
                    System.out.println("--------------------");
            }
        }while (repeat);        
       
        }

    private void convertCelsiusFahrengeit() {
        System.out.println("Введите температуру в Цельсиях: ");
        double temperatureCelsius = scanner.nextDouble(); scanner.nextLine();
        //код конвертации        
        double temperatureFahrengeit = 0;
        temperatureFahrengeit=(temperatureCelsius*9/5)+32;
        System.out.println("По фаренгейту это будет:"+temperatureFahrengeit);
    }
    private void convertFahrengeitCelsius() {
         System.out.println("Введите температуру по фаренгейту: ");
        double temperatureFahrengeit = scanner.nextDouble(); scanner.nextLine();
        //код конвертации        
        double temperatureCelsius = 0;
        temperatureCelsius=(temperatureFahrengeit-32)*5/9;
        System.out.println("По фаренгейту это будет:"+temperatureCelsius);
    }
        
    
}
