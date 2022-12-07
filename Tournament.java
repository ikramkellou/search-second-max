import java.io.Reader;
import java.util.Random;
import java.util.Scanner;
public class Tournament {
    public int[] FMT(int i, int j, int[] tab, int n){
        int[] comp1 = new int[n];
        int[] comp2 = new int[n];
        if (i == j){
            int[] comp = new int[n];
            comp[0] = 1;
            comp[1] = tab[i];
            return comp;
        }
        comp1 = FMT(i, i + (j - i)/2, tab, n);
        comp2 = FMT(i + i + (j - i)/2, j, tab, n);
        if (comp1[1] > comp2[1]){
            int k = comp1[0] + 1;
            comp1[0] = k;
            comp1[k] = comp2[1];
            return comp1;

        }
        else{
            int k = comp2[0] + 1;
            comp2[0] = k;
            comp2[k] = comp1[1];
            return comp2;

        }

    }

    public int SM(int n, int[] tab){
        int[] comp = new int[n];
        int[] comp2 = new int[n];
        int[] comp3 = new int[n];
        comp = FMT(1, n, tab, n);
        for(int i = 2; i < comp[0]; i++){
            comp3[i] = comp[i];
        }
        comp2 = FMT(2, comp[0], comp3, n);
        return comp2[1];
    }
    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        Tournament t = new Tournament();
        Random rand = new Random();
        int[] tab = new int[5];
        for (int i = 0; i < 5; i++){

            tab[i] = rand.nextInt();;
        }
        System.out.println(t.SM(5, tab));
        
    }
    
}
