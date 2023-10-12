/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks.weathercallender;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nikit
 */
public class CalenderWeather {
    private final Scanner scanner;
    enum MonthInYear{
        Январь, Февраль, Март, Апрель, Май, Июнь, Июль, Август, Сентябрь, Октябрь,
        Ноябрь, Декабрь
    }
    
    public CalenderWeather() {
        scanner = new Scanner(System.in);
    }
 
    public void showWeather() {
        MonthInYear[] months = MonthInYear.values();
        
        /*System.out.println("Месяцы в году:");
        for (MonthInYear month : MonthInYear.values()) {
        System.out.println(month);
        }*/
        
        System.out.println("----- Weather in year -----");        
        int [] [] weatherInYear = new int [12] [];
        weatherInYear[0] = new int[31];
        weatherInYear[1] = new int[28];
        weatherInYear[2] = new int[31];
        weatherInYear[3] = new int[30];
        weatherInYear[4] = new int[31];
        weatherInYear[5] = new int[30];
        weatherInYear[6] = new int[31];
        weatherInYear[7] = new int[31];
        weatherInYear[8] = new int[30];
        weatherInYear[9] = new int[31];
        weatherInYear[10] = new int[30];
        weatherInYear[11] = new int[31];
        int max = 40;
        int min = -30;
         Random random = new Random();
        for (int i = 0; i < weatherInYear.length; i++) {/*ctrl -> space*/
            for (int j = 0; j < weatherInYear[i].length; j++) {
                weatherInYear[i][j] = random.nextInt(max - min +1)+min;
                
            }                             
        }
        // Создайте и заполните массив с датами от 1 до 31 для января
        int[] dayInMonth = new int[31];
        for (int i = 0; i < dayInMonth.length; i++) {
            dayInMonth[i] = i + 1;
        }
        // Выводите дни месяца вместе с температурой в виде таблицы
        for (int j = 0; j < weatherInYear[i].length; j++) {
            System.out.print("  День " + dayInMonth[j] + ": ");
            int temperature = weatherInYear[i][j];
            if (temperature < 0) {
                System.out.print(temperature + "°C ");
            } else {
                System.out.print(" " + temperature + "°C ");
            }
            System.out.println("------------------------");
        }
    
        boolean repeat = true;
        do {
            System.out.println("--- Задачи ---");
            System.out.println("0.Выйти обратно в меню");
            System.out.println("1.Погода в указанную дату");
            System.out.println("2.Дни в которые былла самая тёплая и холодная погода");
            System.out.println("3.Средняя температура за указанный месяц");
            System.out.println("4.Средняя температура по всем месяцам");
            System.out.print("Выберите номер задачи: ");
            int task = scanner.nextInt();scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из программы, вы вернётесь"+
                            "в прошлое меню");
                    repeat= false;
                    break;
                case 1:
                    
                    break;
                 case 2:
                    
                    break;
                 case 3:
                    
                    break;
                 case 4:
                    
                    break;
                default:
                     System.out.println("Выберите номер из списка");  
            }
        } while (repeat);
        
    }
    
}
