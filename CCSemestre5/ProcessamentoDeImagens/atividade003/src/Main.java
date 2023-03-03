import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] a1 = new int[5];
        int[] a2 = new int[5];
        int[] a3 = new int[a1.length + a2.length];
        Random random = new Random();
        for (int i = 0; i < a1.length; i++) {
            a1[i] = random.nextInt(100);
            a2[i] = random.nextInt(100);
        }
        System.arraycopy(a1, 0, a3, 0, a1.length);
        System.arraycopy(a2, 0, a3, a1.length, a2.length);
        Arrays.sort(a3);
        System.out.println(Arrays.toString(a3));
    }
}