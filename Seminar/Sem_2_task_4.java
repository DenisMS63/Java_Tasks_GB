/*
 * Задание №4
Напишите метод, который составит строку, состоящую из 100
повторений слова TEST и метод, который запишет эту строку в
простой текстовый файл, обработайте исключения.
 */

package Seminar;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Sem_2_task_4 {

    static Logger log = Logger.getAnonymousLogger();


    public static void main(String[] args) {
        String s1 = "test";
        
        String filePath = "Seminar/text.txt";
        String logPath = "Seminar/log.txt";
        int num = 10;


        createLogger(logPath);

        String s2 = repeat(s1, num);
        writeToFile(s2, filePath);

        closeLogger();
    }


    static void createLogger(String logPath) {
        
        try {
            FileHandler fh = new FileHandler(logPath, true);           // перехватытвает ЛОГИ и записывает их в файл //true опять же для добавления информ, а не перезаписывания
            SimpleFormatter sf = new SimpleFormatter();     // для измение вида создаваемого Лога
            fh.setFormatter(sf);
            log.addHandler(fh);
        } catch (SecurityException e) {            
            e.printStackTrace();
        } catch (IOException e) {            
            e.printStackTrace();
        }        
    }




    static void closeLogger() {
        Handler [] handlers = log.getHandlers();
        for(Handler handler: handlers){
            handler.close();
        }
    }




    static String repeat(String s, int n) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString();
    }




    static void writeToFile(String s, String filePath){        
        
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {        // то что будет создано внутри круглых скобочек (ресурс) будет автоматически закрыто в конце работы блока try-catch (вместо метода fileWriter.close();)
            // если true, то файл дозаписывается, если false, то файл перезаписывается
            
            fileWriter.write(s);        // добавление в буфер
            fileWriter.write("\n"); // для того чтобы новый текст был с новый строки
            //fileWriter.flush();         // после этого делается запись непосредственно в файл (из буфера в файл), используется когда нужно записать большой объем информации (книга, в буфер все страницы не поместятся)
            fileWriter.close();         // закрытие потока связанного с файлом, нужно обязательно, иначе файл будет заблокирован, так же выполняется метод .flush()
            
            log.info("Файл успешно записан");

        } catch (Exception e) {                             // IOException исключения только типа IO, просто Exception это все исключения
            log.warning("Не удалось записать текст в файл");

            e.printStackTrace();
        }
    }


    

    static String readFile(String filePath) {

        StringBuilder sb = new StringBuilder();
        File file = new File(filePath);

        try (Scanner sc = new Scanner(file)){

            while (sc.hasNext()){              // hasNext() то есть в файле есть что еще читать, не дошли до конца
                sb.append(sc.nextLine());
            }                             
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();        
    }
}
