import java.util.Scanner;
import java.util.Random;
public class Methode2 {
    final int n = 5;
    public int FMR(int i,int j,int[] tab) {
        int m;
        int max1 = 0;
        int max2 = 0;
        if (i==j){
            return tab[i];
        }else
        
        {
            m=i+(j-i)/2;
            max1=FMR(i,m,tab);
            max2=FMR(1+m,j,tab);  
        }
        if (max1 > max2) {
            return max1;
        }
        else{
            return max2;
        }

    }
   // public int 
    public static void main(String[] args) {
        Scanner lire = new Scanner(System.in);
        Random rand = new Random();
        //System.out.println(rand.ints(10, 100));
        int n = 500;
        int[] tab = new int[n];

        for (int i = 0; i < n; i++){

          tab[i] = rand.nextInt();;
      }
      Methode2 p = new Methode2();
      System.out.println(p.FMR(0,n-1,tab));
      lire.nextInt();
    }
}
