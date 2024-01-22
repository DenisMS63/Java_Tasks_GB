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
        for (int i = 2; i <= 1000; i++) {
            
            for (int j = 1; j <= i; j++) {
                if(i % j == 0 && j == i){
                    System.out.println(i);
                }
            }
                           
        }
    }
}