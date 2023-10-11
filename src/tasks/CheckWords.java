/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasks;

/**
 *
 * @author nikit
 */
public class CheckWords {

    public void showWords() {
        System.out.println("--Проверка на строк на содержание букв в тексте--");
        String text ="I enjoy learning new languages and exploring different cultures";
        String[] words = text.split("\\W+");
        System.out.printf("Words in text = %d%n", words.length);
        for (String w: words) {
            System.out.print(w + "; ");
        }
        System.out.println("\n----------------------");
        System.out.print("Using boolean contains ");
        boolean containsWord = text.matches(".*[a - z].*");
        System.out.println(containsWord);
    }
    
}
