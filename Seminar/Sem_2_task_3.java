/*
 * Задание №3
Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает
boolean значение).
 */

package Seminar;

public class Sem_2_task_3 {
    public static void main(String[] args) {
        
        String str = "А роза упала на лапу Азора";

        System.out.println(polindrom (str));
        

    }

    static boolean polindrom (String s) {

        s = s.toLowerCase();
        s = s.replace(" ", "");
        
        
        for (int i = 0; i < s.length() / 2; i++) {
            
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {return false;}
            
        }

        return true;
    }
}   
