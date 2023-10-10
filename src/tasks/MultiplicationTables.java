/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author nikit
 */
public class MultiplicationTables {
    private final Scanner scanner; 
    
    public MultiplicationTables(){
        this.scanner = new Scanner(System.in);
    }
    public MultiplicationTables(Scanner scanner) {        
        this.scanner=scanner;
    }
    public void PrintExamples() {
        System.out.println("-----------------");
        int score=0;
        int time=0;
        while (time!=5) {
            Random random = new Random();
            int numRandom1 = random.nextInt(10);
            int numRandom2 = random.nextInt(10);
            System.out.print("Введите ответ: "+numRandom1+"*"+numRandom2+" = ");
            try {
                int answer = scanner.nextInt(); // Попробуйте считать целое число
                time++;
                if (answer==numRandom1*numRandom2) {
                    score++;
                    System.out.println("Молодец, правильный ответ");
                    System.out.println("Время: "+time);
                    System.out.println("Очки: "+score);                
                }
                else if (answer!=numRandom1*numRandom2) {
                    System.out.println("Неправильный ответ");
                    System.out.println("Время: "+time);
                    System.out.println("Очки: "+score);

                }
                if (time==5) {                          
                    if (score == 5) {
                        System.out.println("Молодец, "+score+" правильных ответов");
                    }
                    else if (time==5 && score==4) {
                        System.out.println("Надо подучить таблицу");
                        System.out.print("правильных ответов: "+score);
                    }
                    else if (time==5 && score==3) {
                        System.out.println("Надо подучить таблицу");
                        System.out.print("правильных ответов: "+score);
                    }
                    else if (time==5 && score<=2) {
                        System.out.println("Срочно нужно учить таблицу");
                         System.out.println("правильных ответов: "+score);
                    }
                } 
                
            }catch(InputMismatchException e)
            {
                System.out.println("Ошибка: Введите целое число.");
                scanner.next(); // Очистите ввод, чтобы избежать зацикливания
            }
        }
        
        System.out.print("-----------------");
        System.out.println("");
    }
    
}
