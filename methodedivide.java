import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class methodedivide {

    public double DAC_Max(double a[], int index, int l) {
        
        double max;
        if (l - 1 == 0) {
            return a[index];
        }
        if (index >= l - 2) {
            if (a[index] > a[index + 1])
                return a[index];
            else
                return a[index + 1];
        }

        // Logic to find the Maximum element
        // in the given array.
        max = DAC_Max(a, index + 1, l);

        

        if (a[index] > max)
            return a[index];
        else
            return max;
        
        
    }

    public static void main(String[] args) {

        methodedivide proj = new methodedivide();
        Random rand = new Random();
        Scanner reader = new Scanner(System.in);

        int n = 20000;
        int a = 1000;
        int b = 0;
        double[] tab = new double[n];

        for (int i = 0; i < n; i++) {

            tab[i] = Math.random() * (a - b + 1) + b;

        }

       long start = System.nanoTime();
        double max1 = proj.DAC_Max(tab, 0, n);

        double max2 = 0;

        for (int i = 0; (i < n); i++) {

            if (max2 < tab[i] & (max1 != tab[i])) {
                max2 = tab[i];
            }

        }

       long end = System.nanoTime();
        System.out.println(end-start);

        
        reader.nextInt();
    }
}
