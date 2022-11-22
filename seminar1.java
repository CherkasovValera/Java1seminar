//1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
import java.util.Arrays;
import java.util.Random;

public class seminar1 {
    public static void main(String[] args){
        int  k = 2001;        
        int j = new Random().nextInt(k);
        j=j-1000;
            System.out.println(j);
            // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
            // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
            int x = 1001;
            int n = new Random().nextInt(x);
            System.out.println("Кратные " + n);
            //if (1000-i > n){
                int[] m1Array = new int[Short.MAX_VALUE];
                for (int i = 0; j < Short.MAX_VALUE; j++) {
                    if (j % n == 0){
                        m1Array [i] = j;//append(m1Array, i);
                        // if ( m1Array[i] != 0){
            //System.out.println(Arrays.toString(m1Array));
                        System.out.print(m1Array[i]+", ");
                        // }
                    }
                }
            //}else{
              //  System.out.println("Таких чисел нет");
            //}
            // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
            // for (int s = 0; i > -1000; i--) {
            //     if (i % n == 0){
            //         System.out.println(i);
            //     }    
            // }
    }

    private static int[] append(int[] m1Array, int i) {
        return null;
    }
}

// Пункты реализовать в методе main
// *Пункты реализовать в разных методах