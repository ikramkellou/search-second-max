import java.util.Random;
import java.util.Scanner;

public class Methode1 {
       public static void main(String[] args) {
         
        Scanner lire = new Scanner(System.in);
        Random rand = new Random();
        //System.out.println(rand.ints(10, 100));
        int n = 8500;
        double a = 20000;double b = 0;

        double[] tab = new double[n];

        for (int i = 0; i < n; i++){

          tab[i] = i ;
      }

      long first = System.nanoTime();

        double max1 = tab[0];
        int pos = 0;


        for (int i = 0; i < n; i++){

            if (max1 < tab[i]){
                max1 = tab[i];
                pos  = i;
            }

        }

        double max2 = 0;
        for (int j = 0; (j < n ) ; j++){

            if ((max2 < tab[j]) && (j != pos)){
                max2 = tab[j];
            }

        }
        
        //System.out.println(max2);
        long end = System.nanoTime();
        System.out.println(end-first);
        lire.nextInt();
        
    }
    
}
