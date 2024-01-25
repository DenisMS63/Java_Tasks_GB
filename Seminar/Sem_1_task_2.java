/*
 * Задание №2
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
 */

 package Seminar;

public class Sem_1_task_2 {
    
    public static void main(String[] args) {
        
        String str = "aaaabbbcdd";

        System.out.println("Сжатая строка: " + CompressStr(str));
        
    }

    static String CompressStr(String s) {

        StringBuilder sb = new StringBuilder();
        int count = 1;
        int lenStr = s.length();
        
        for (int i = 1; i < lenStr; i++) {
            
            if (s.charAt(i) == s.charAt(i - 1)) {

                count++;

            } else {

                sb.append(s.charAt(i - 1));

                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }

        sb.append(s.charAt(lenStr - 1));
        if (count > 1) {
            sb.append(count);
        }

        return sb.toString();
    }

}




// static void CompressStr(String s) {

//     String newStr = "";
//     StringBuilder sb = new StringBuilder();
//     int lenStr = s.length();
//     int count = 0;

//     for (int i = 0; i < lenStr; i++) {
        
//         char curr = s.charAt(i);
//         if (s.charAt(i + 1) == curr) {

//             count++;
//         } else {
//             String ns = Character.toString(curr);
//             sb.append(count + ns);
//             count = 0;
//         }
//     }

//     System.out.println(sb);
// } 

