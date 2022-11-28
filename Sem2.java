public class Sem2 {
    private static void arrReverse (int[] a){
        int last = a.length-1;
        for (int i = 0; i < a.length/2; i++) {
            int tmp=a[i];
            a[i] = a[last-i];
            a[last-i] = tmp;
        }
    }
    
}
