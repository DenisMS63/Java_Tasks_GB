/*
 Напишите функцию printPrimeNums, 
 которая выведет на экран все простые числа в промежутке от 1 до 1000, 
 каждое на новой строке.
 Напишите свой код в методе printPrimeNums класса Answer.
 */

public class Dz_task_2 {
    public static void main(String[] args) { 
        
        Answer ans = new Answer();              
        ans.printPrimeNums();
      }
}

class Answer {
    public void printPrimeNums(){
        // Напишите свое решение ниже
        int count = 0;                          // вывести все простые числа от 1 до 1000

        for (int i = 1; i < 1000; i++) {            
            
            count = 0;

            for (int j = 1; j <= i; j++) {
                
                if (i % j == 0) {
                    count++;
                }
            }
            
            if (count == 2) {
                System.out.println(i);
            }
        }  
    }
}