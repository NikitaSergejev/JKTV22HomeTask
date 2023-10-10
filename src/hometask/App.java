/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hometask;

import tasks.ArrayBooks;
import tasks.WesternCalender;
import tasks.MultiplicationTables;
import tasks.RandomArray;
import java.util.Scanner;
import tasks.TemperaturConverter;
import tasks.NumberParcer;


/**
 *
 * @author pupil
 */
public class App {
    private final Scanner scanner;/*поле хранит состояние класса*/
    
    public App() {
        this.scanner= new Scanner(System.in);
    }

    public App(Scanner scanner) {
        this.scanner = scanner;
    }
    

    public void run() {/*Метод void ничего не возвращяет*/
        boolean repeat = true;
        do {
            System.out.println("Выберите задачу ");
            System.out.println("0.Закончить программу");
            System.out.println("1.Конвертор температуры");
            System.out.println("2.Парсер числа");
            System.out.println("3.Вычесления массива случайных чисел");
            System.out.println("4.Восточный календарь");
            System.out.println("5.Таблица умножения");
            System.out.println("6. книги");
            System.out.print("Номер задачи ");
            int task = scanner.nextInt();
            switch (task) { /*sw-> tab*/
                case 0:
                    System.out.println("Выбран выход из программы");
                    repeat = false;
                    break;
                case 1:
                    TemperaturConverter temperaturConverter = new TemperaturConverter (scanner);
                    temperaturConverter.DoConvert();
                    break;
                case 2:
                    System.out.println("Выбрано парсер числа");
                    NumberParcer numberParcer = new NumberParcer(scanner);
                    numberParcer.doParse();
                    break;
                case 3:          
                    System.out.println("Выбрано создание массива");
                    RandomArray randomArray = new RandomArray(scanner);
                    randomArray.PrintResult();
                    break;
                case 4:
                    System.out.println("Выбран восточный календарь");
                    WesternCalender westernCalender = new WesternCalender(scanner);
                    westernCalender.DoResult();
                    break;
                case 5:
                    System.out.println("Решите 5 примеров из таблицы умножения");
                    MultiplicationTables multiplicationTables = new MultiplicationTables(scanner);
                    multiplicationTables.PrintExamples();
                    break;
                case 6:
                    ArrayBooks arrayBooks; 
                    arrayBooks = new ArrayBooks();
                    arrayBooks.showBooks(); 
                default:
                    System.out.println("Выберите номер из списка");
            }
        }while (repeat);
        
       
        }
       
    }
    

