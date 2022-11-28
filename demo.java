public class demo {
    public static void main(String[] args){
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
        array[i] = ((int)(Math.random() * 31) - 15);
        System.out.println(array[i]);
        }
    
    }
}

//        randomInt();
int n = new Random().nextInt(0,128);
int i = randomInt();

System.out.printf("n = " + n 
/        randomInt();
int n = new Random().nextInt(0,128);
int i = randomInt();

System.out.printf("n = " + n + "; i = " + i + " \n ");
int count = 0;
for (int j = i; j < Short.MAX_VALUE; j++) {
    if (j % n == 0) {
        System.out.printf(j + "  ");
        count++;
    }
}
//        System.out.println(count);
//        System.out.println(count);

int[] arr = new int[count];
count = 0;
for (int j = i; j < Short.MAX_VALUE; j++) {
    if (j % n == 0) {
        arr[count] = j;
        count += 1;
    }делимое
}
System.out.println("");
System.out.print(Arrays.toString(arr));

//        for (int each: arr) {
//            System.out.println(each);
//        }

System.out.println("=================");
System.out.println(count);

            