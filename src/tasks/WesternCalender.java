/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Scanner;

/**
 *
 * @author nikit
 */
public class WesternCalender {
    private final Scanner scanner; 
    
    public WesternCalender() {
        this.scanner = new Scanner(System.in);
        
    }
    public WesternCalender(Scanner scanner) {
        this.scanner = scanner;
        
    }

    public void DoResult() {
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        int baseYear = 1984;
        int cycleLength = 60;
        int animalCycleLength = 12;

        // Вычисляем разницу между заданным годом и базовым годом
        int yearDiff = year - baseYear;

        // Находим номер цвета (подцикла)
        int colorNumber = (yearDiff % cycleLength) / animalCycleLength;

        // Находим номер животного внутри подцикла
        int animalNumber = yearDiff % animalCycleLength;

        String[] colors = {"Зелёный", "Красный", "Жёлтый", "Белый", "Голубой"};
        String[] animals = {"Крыса", "Корова", "Тигр", "Заяц", "Дракон", "Змея",
            "Лошадь", "Овца", "Обезьяна", "Курица", "Собака", "Свинья"};

        String color = colors[colorNumber];
        String animal = animals[animalNumber];

        System.out.println("Цвет: " + color);
        System.out.println("Животное: " + animal);
        /*System.out.print("Введите год: ");
        int year = scanner.nextInt();
        int deltaYear=0;
        if(year>=1984)
        {
            deltaYear=(year-1984)%60;
        }
        if(year<=1984)
        {
            deltaYear=(year+1984)%60;
        }
        if(year == 1984)
        {
            deltaYear=year%60-3;
        }
        int colorYear=deltaYear%12;
        String color = null;
        String animal = null;
        
        if (colorYear >=1 && colorYear <=12) {
            color="Зелёный";   
        }
        else if (colorYear >=13 && colorYear<=24) {
            color="Красный";
        }
        else if (colorYear >=25 && colorYear<=36) {
            color="Жёлтый";
        }
        else if (colorYear >=37 && colorYear<=48) {
            color="Белый";
        }
        else if (colorYear >=49 && colorYear<=60) {
            color="Голубой";
        }
        switch (deltaYear) {
            case 1:
                animal="Крыса";
                break;
            case 2:
                animal="Корова";
                break;
            case 3:
                animal="Тигр";
                break;
            case 4:
                animal="Заец";
                break;
             case 5:
                animal="Дракон";
                break;
             case 6:
                animal="Змея";
                break;
             case 7:
                animal="Лощадь";
                break;
             case 8:
                animal="Овца";
                break;
             case 9:
                animal="Обезьяна";
                break;
             case 10:
                animal="Курица";
                break;
            case 11:
                animal="Собака";
                break;
             case 12:
                animal="Свинья";
                break;                            
            default:
                System.out.println("--------------------");;
        }
        System.out.println("Цвет:"+color+"Животное: "+animal);*/
        }
        
    }
    

