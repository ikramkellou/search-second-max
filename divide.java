import java.util.Scanner;
import java.util.Random;

public class divide {

    int larg,second;

    public void SM(int a[], divide d,int left, int right){
        if (left == right){
            d.larg = left;
            d.second = left;

        }
        else if (left == right-1){
            if (a[left] > a[right]){
                d.larg = left;
                d.second = right;
            }
            else {
                d.larg = right;
                d.second = left;
            }

        }
        else {
            int k = (right - left - 1)/2;
            for (int i = left; i < left+k; i++){
                if (a[i+k] < a[i]){
                    int temp = a[i];
                    a[i] = a[i + k];
                    a[i + k] = temp;
                }
            }
            SM(a, d, left+k, right);
            if (a[d.larg-k]>a[d.second]){
                d.second=d.larg-k;
            }
        }
        

    }
    public static void main(String[] args) {

        divide d = new divide();

        methodedivide proj = new methodedivide();
        Random rand = new Random();
        Scanner reader = new Scanner(System.in);

        int n = 100;
        int a = 1000;
        int b = 0;
        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {

            tab[i] = rand.nextInt() * (a - b + 1) + b;

        }


        d.SM(tab, d, 0, n-1);
        System.out.println(d.second);
        reader.nextInt();
        reader.nextInt();
    }
}

