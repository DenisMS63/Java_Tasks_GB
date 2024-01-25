/*
 * Дан массив nums = [3,2,3,4] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести
эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива
должны быть отличны от заданного, а остальные - равны ему.
 */

import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
        int [] arr = {3,2,3,4,2,3,4,5,3,6};
        int val = 3;
        
        int [] res = SortByVal(arr, val);

        System.out.println(Arrays.toString(res));
    }

    static int [] SortByVal(int [] rr, int n) {

        int [] newArr = new int [rr.length];

        Arrays.fill(newArr, n);                         // заполняется массиив newArr значением n (в дальнейшем val)

        for (int i = 0, j = 0; i < rr.length; i++) {

            if (rr[i] != n) {                           // если текущий элемент не равен n (то есть val) тогда эл-т нового массива с таким же индексом получает текущее значение изначального массива  
                newArr[j] = rr[i];
                j++;
            }
        }
        
        return newArr;
    }
}
