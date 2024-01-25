/*
 * Задание №1
Дано четное число N ( > 0 ) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1.
 */

package Seminar;

import java.util.Scanner;

public class Sem_1_task_1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый символ: ");
        String ch1 = scanner.nextLine();

        System.out.println("Введите второй символ: ");
        String ch2 = scanner.nextLine();

        System.out.println("Введите кол-во символов: ");
        int num = scanner.nextInt();
        
        CreateString (num, ch1, ch2);
    }

    public static void CreateString (int n, String c1, String c2) {

        StringBuilder sb = new StringBuilder();        
        for (int i = 0; i < n; i++) {
            
            sb.append(c1 + c2);
        }

        System.out.println(sb);
    }
}
