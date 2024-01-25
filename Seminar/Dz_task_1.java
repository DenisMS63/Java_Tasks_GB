/*
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n).
Внутри класса Answer напишите метод countNTriangle, 
который принимает число n и возвращает его n-ое треугольное число.
Если число n < 1 (ненатуральное) метод должен вернуть -1.
 */

public class Dz_task_1 {
    public static void main(String[] args) { 
        int n = 0;
        
        if (args.length == 0) {
          // При отправке кода на Выполнение, вы можете варьировать эти параметры
          n = 6;
        }
        else{
          n = Integer.parseInt(args[0]);
        }     
        
          // Вывод результата на экран
        Answer ans = new Answer(); 
        int itresume_res = ans.countNTriangle(n);     
        System.out.println(itresume_res);
      }
}

class Answer {
    public int countNTriangle(int n){
      // Введите свое решение ниже
        if (n < 1) {
            return -1;
        } else {
            int res = (n * (n + 1)) / 2;
        return res;
        }
        
    }
}