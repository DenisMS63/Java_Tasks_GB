

public class Test {
    public static void main(String[] args) {

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
