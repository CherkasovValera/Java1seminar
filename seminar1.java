//1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
import java.util.Arrays;
import java.util.Random;

public class seminar1 {
    public static void main(String[] args){               
        int i = new Random().nextInt(-1000,1000);
        System.out.println(i);
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
System.out.println("\n"+"===================================");
        i = Math.abs(i);
        int n = Integer.toBinaryString(i).length();
        System.out.println(n);        
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
       
        int count = 0;
        for (int j = n; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {            
                count++;
            }
        }
            System.out.println("\n"+"=================");
            System.out.println("Числа кратные " + n + " от "+ i + " до MAX_VALUE"+"\n");            
            System.out.println("=================");
                        
            int[] m1Array = new int[count];
            count=0;            
            for (int j = n; j < Short.MAX_VALUE; j++) {
                if (j % n == 0){
                    m1Array [count] = j;
                    count+=1;
                }
                    
            }
            System.out.print(Arrays.toString(m1Array));
                
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
                // Создаем и заполняем массив
                // int z = new Random().nextInt(0,1000);
                count = 0;
                for (int j = Short.MIN_VALUE; j < n; j++) {
                    if (j % n != 0) {                        
                        count++;
                    }
                }
                System.out.println("Числа кратные " + n + " от MIN_VALUE до " + i );            
                int[] m2Array = new int[count];
                count = 0;
                for (int j = Short.MIN_VALUE; j < n; j++) {
                    if (j % n != 0){                        
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
// //     
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