public class demo {
    public static void main(String[] args){
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
        array[i] = ((int)(Math.random() * 31) - 15);
        System.out.println(array[i]);
        }
    
    }
}