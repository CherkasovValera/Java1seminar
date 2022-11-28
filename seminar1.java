//1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
import java.util.Arrays;
import java.util.Random;

public class seminar1 {
    public static void main(String[] args){
        // int  k = 2001;        
        int i = new Random().nextInt(-1000,1000);
//         // j=j-1000;
//             System.out.println(i);
            
//             // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
//             // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
//             // int x = 1001;
        int n = new Random().nextInt(0,1000);
        int count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
            System.out.printf(j + "  ");
                count++;
            }
        }
            System.out.println("\n"+"=================");
            System.out.println("Числа кратные " + n + " от "+ i + " до MAX_VALUE"+"\n");            
            System.out.println("=================");
            // System.out.println(count);
            
            int[] m1Array = new int[count];
            count=0;
            // int[] m1Array = {n};
            for (int j = i; j < Short.MAX_VALUE; j++) {
                if (j % n == 0){
                    m1Array [count] = j;
                    count+=1;
                }
                    
            }
            System.out.print(Arrays.toString(m1Array));
                //                         // System.out.print(m1Array[i]+", ");
                
                // }            
                // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
                
                int z = new Random().nextInt(0,1000);
                count = 0;
                for (int j = Short.MIN_VALUE; j < z; j++) {
                    if (j % z != 0) {
                        // System.out.printf(j + "  ");
                        count++;
                    }
                }
                System.out.println("Числа кратные " + z + " от MIN_VALUE до " + i );            
                int[] m2Array = new int[count];
                count = 0;
                for (int j = Short.MIN_VALUE; j < z; j++) {
                    if (j % z != 0){
                        // m2Array [i] = j;
                        // System.out.println(m2Array[i]+", ");
                        m2Array [count] = j;
                        count++;
                    }    
                }
                System.out.print(Arrays.toString(m2Array));
    }
}

//     private static int[] append(int[] m2Array, int j) {
//         return null;
//     }

//     private static int[] append(int[] m1Array, int i) {
//         return null;
//     }
// }
//от минуса
//         static void allNotMultiple (int divisible, int divisor) {
//             System.out.printf("Делитель = " + divisor + "; Начало интервала = " + divisible + " \n ");
    
// //     // Определяем размер массива
//             int count = 0;
//             for (int j = Short.MIN_VALUE; j < divisible; j++) {
//                 if (j % divisor != 0) {

//                 count++;
//                 }
//             }
// //     // Создаем и заполняем массив
//             int[] m2 = new int[count];
//             count = 0;
//             for (int j = Short.MIN_VALUE; j < divisible; j++) {
//                 if (j % divisor != 0) {
//                     m2[count] = j;
//                     count += 1;
//                 }
//             }
//             System.out.println("");
//             System.out.print(Arrays.toString(m2));
//         }       
//     }
// }
// Пункты реализовать в методе main
// *Пункты реализовать в разных методах