/*
 * Во фразе "Добро пожаловать на курс по Java" переставить слова
в обратном порядке.
 */

public class Task_5 {
    public static void main(String[] args) {
        
        String s = "Добро пожаловать на курс по Java";
        String [] arr = s.split(" ");
        String newS = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            newS += arr[i] + " ";
        }
        System.out.println(newS.trim());
    }
}
